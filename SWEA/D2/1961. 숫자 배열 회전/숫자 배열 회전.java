import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int[][] rot90 = rotate(arr, n);
            int[][] rot180 = rotate(rot90, n);
            int[][] rot270 = rotate(rot180, n);

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(tc).append("\n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) sb.append(rot90[i][j]);
                sb.append(" ");
                for (int j = 0; j < n; j++) sb.append(rot180[i][j]);
                sb.append(" ");
                for (int j = 0; j < n; j++) sb.append(rot270[i][j]);
                sb.append("\n");
            }

            System.out.print(sb.toString());
        }
    }

    static int[][] rotate(int[][] origin, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = origin[n - 1 - j][i];
            }
        }
        return result;
    }
}
