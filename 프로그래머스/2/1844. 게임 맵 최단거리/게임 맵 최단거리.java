import java.util.*;

class Solution {

    public int solution(int[][] maps) {
        return bfs(maps);
    }

    private int bfs(int[][] maps) {

        int r = maps.length;
        int c = maps[0].length;

        int[][] distance = new int[r][c];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> que = new ArrayDeque<>();

        que.offer(new int[]{0, 0});
        distance[0][0] = 1;

        while (!que.isEmpty()) {

            int[] current = que.poll();

            int x = current[0];
            int y = current[1];

            if (x == r - 1 && y == c - 1) {
                return distance[x][y];
            }

            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                    continue;
                }

                if (maps[nx][ny] == 0) {
                    continue;
                }

                if (distance[nx][ny] != 0) {
                    continue;
                }

                distance[nx][ny] = distance[x][y] + 1;

                que.offer(new int[]{nx, ny});
            }
        }

        return -1;
    }
}