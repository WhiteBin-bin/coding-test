import java.util.*;

class Solution {

    private final int[] dx = {-1, 1, 0, 0};
    private final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        Queue<int[]> que = new LinkedList<>();

        que.offer(new int[]{0, 0});

        while (!que.isEmpty()) {
            int[] current = que.poll();

            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (maps[nx][ny] == 0) {
                    continue;
                }

                if (maps[nx][ny] != 1) {
                    continue;
                }

                maps[nx][ny] = maps[x][y] + 1;
                que.offer(new int[]{nx, ny});
            }
        }

        if (maps[n - 1][m - 1] == 1) {
            return -1;
        }

        return maps[n - 1][m - 1];
    }
}