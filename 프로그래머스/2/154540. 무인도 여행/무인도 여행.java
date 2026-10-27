import java.util.*;

class Solution {

    public int[] solution(String[] maps) {
        return bfs(maps);
    }

    private int[] bfs(String[] maps) {

        int r = maps.length;
        int c = maps[0].length();

        boolean[][] visited = new boolean[r][c];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {

                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    
                    int sum = bfsIsland(maps, visited, i, j);

                    result.add(sum);
                }
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(result);

        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }

    private int bfsIsland(String[] maps, boolean[][] visited,
                          int startX, int startY) {

        int r = maps.length;
        int c = maps[0].length();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> que = new ArrayDeque<>();

        que.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        int sum = 0;

        while (!que.isEmpty()) {

            int[] current = que.poll();

            int x = current[0];
            int y = current[1];

            sum += maps[x].charAt(y) - '0';

            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                    continue;
                }

                if (maps[nx].charAt(ny) == 'X') {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                que.offer(new int[]{nx, ny});
            }
        }

        return sum;
    }
}