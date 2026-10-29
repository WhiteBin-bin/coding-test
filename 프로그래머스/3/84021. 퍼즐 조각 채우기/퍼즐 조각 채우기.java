import java.util.*;

class Solution {

    public int solution(int[][] game_board, int[][] table) {

        List<List<int[]>> blanks = findShapes(game_board, 0);
        List<List<int[]>> pieces = findShapes(table, 1);

        boolean[] used = new boolean[pieces.size()];
        int answer = 0;

        for (List<int[]> blank : blanks) {

            for (int i = 0; i < pieces.size(); i++) {

                if (used[i]) {
                    continue;
                }

                List<int[]> piece = pieces.get(i);

                if (blank.size() != piece.size()) {
                    continue;
                }

                List<int[]> rotated = piece;

                for (int j = 0; j < 4; j++) {

                    if (isSame(blank, rotated)) {
                        answer += blank.size();
                        used[i] = true;
                        break;
                    }

                    rotated = rotate(rotated);
                }

                if (used[i]) {
                    break;
                }
            }
        }

        return answer;
    }

    private List<List<int[]>> findShapes(int[][] board, int target) {

        int r = board.length;
        int c = board[0].length;

        boolean[][] visited = new boolean[r][c];

        List<List<int[]>> shapes = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (board[i][j] == target && !visited[i][j]) {

                    List<int[]> shape = bfs(board, visited, i, j, target);

                    shapes.add(shape);
                }
            }
        }

        return shapes;
    }

    private List<int[]> bfs(int[][] board, boolean[][] visited,
                            int startX, int startY, int target) {

        int r = board.length;
        int c = board[0].length;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> que = new ArrayDeque<>();
        List<int[]> shape = new ArrayList<>();

        que.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!que.isEmpty()) {

            int[] current = que.poll();

            int x = current[0];
            int y = current[1];

            shape.add(new int[]{x, y});

            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                    continue;
                }

                if (board[nx][ny] != target) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                que.offer(new int[]{nx, ny});
            }
        }

        return normalize(shape);
    }

    private List<int[]> normalize(List<int[]> shape) {

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int[] point : shape) {
            minX = Math.min(minX, point[0]);
            minY = Math.min(minY, point[1]);
        }

        List<int[]> result = new ArrayList<>();

        for (int[] point : shape) {
            result.add(new int[]{
                point[0] - minX,
                point[1] - minY
            });
        }

        result.sort((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }

            return Integer.compare(a[0], b[0]);
        });

        return result;
    }

    private List<int[]> rotate(List<int[]> shape) {

        List<int[]> rotated = new ArrayList<>();

        for (int[] point : shape) {
            rotated.add(new int[]{
                point[1],
                -point[0]
            });
        }

        return normalize(rotated);
    }

    private boolean isSame(List<int[]> a, List<int[]> b) {

        if (a.size() != b.size()) {
            return false;
        }

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i)[0] != b.get(i)[0] ||
                a.get(i)[1] != b.get(i)[1]) {
                return false;
            }
        }

        return true;
    }
}