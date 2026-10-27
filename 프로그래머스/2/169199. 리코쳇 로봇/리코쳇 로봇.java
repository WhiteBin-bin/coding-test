import java.util.*;

class Solution {
    public int solution(String[] board) {
        int r = board.length;
        int c = board[0].length();
        int[] start = new int[2];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i].charAt(j) == 'R') {
                    start = new int[]{i, j};
                }
            }
        }

        return bfs(board, start);
    }

    private int bfs(String[] board, int[] start) {

        int r = board.length;
        int c = board[0].length();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[][] distance = new int[r][c];

        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{start[0], start[1]});
        distance[start[0]][start[1]] = 1;

        while (!que.isEmpty()) {
            int[] current = que.poll();
            int x = current[0];
            int y = current[1];

            if (board[x].charAt(y) == 'G') {
                return distance[x][y] - 1;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x;
                int ny = y;

                while (true) {
                    int nextX = nx + dx[i];
                    int nextY = ny + dy[i];

                    if (nextX < 0 || nextY < 0 || nextX >= r || nextY >= c) {
                        break;
                    }

                    if (board[nextX].charAt(nextY) == 'D') {
                        break;
                    }

                    nx = nextX;
                    ny = nextY;
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