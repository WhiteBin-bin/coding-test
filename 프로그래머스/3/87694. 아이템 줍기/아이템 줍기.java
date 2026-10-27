import java.util.*;

class Solution {

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {

        int[][] board = new int[102][102];

        for (int[] rect : rectangle) {

            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            for (int x = x1; x <= x2; x++) {
                for (int y = y1; y <= y2; y++) {
                    board[x][y] = 1;
                }
            }
        }

        for (int[] rect : rectangle) {

            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            for (int x = x1 + 1; x < x2; x++) {
                for (int y = y1 + 1; y < y2; y++) {
                    board[x][y] = 0;
                }
            }
        }

        return bfs(board, characterX * 2, characterY * 2, itemX * 2, itemY * 2);
    }

    private int bfs(int[][] board, int startX, int startY, int itemX, int itemY) {

        int[][] distance = new int[102][102];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> que = new ArrayDeque<>();

        que.offer(new int[]{startX, startY});
        distance[startX][startY] = 1;

        while (!que.isEmpty()) {

            int[] current = que.poll();

            int x = current[0];
            int y = current[1];

            if (x == itemX && y == itemY) {
                return (distance[x][y] - 1) / 2;
            }

            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 ||
                    nx >= 102 || ny >= 102) {
                    continue;
                }

                if (board[nx][ny] != 1) {
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