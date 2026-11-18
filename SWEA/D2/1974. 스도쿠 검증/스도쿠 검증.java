import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int[][] map = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int result = 1;

            for (int i = 0; i < 9; i++) {
                boolean[] rowCheck = new boolean[10];
                boolean[] colCheck = new boolean[10];

                for (int j = 0; j < 9; j++) {
                    int rowNum = map[i][j];
                    int colNum = map[j][i];

                    if (rowCheck[rowNum] || colCheck[colNum]) {
                        result = 0;
                        break;
                    }
                    rowCheck[rowNum] = true;
                    colCheck[colNum] = true;
                }
                if (result == 0) break;
            }

            if (result == 1) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 9; j += 3) {
                        boolean[] boxCheck = new boolean[10];

                        for (int r = 0; r < 3; r++) {
                            for (int c = 0; c < 3; c++) {
                                int num = map[i + r][j + c];
                                if (boxCheck[num]) {
                                    result = 0;
                                    break;
                                }
                                boxCheck[num] = true;
                            }
                            if (result == 0) break;
                        }
                        if (result == 0) break;
                    }
                    if (result == 0) break;
                }
            }

            System.out.println("#" + tc + " " + result);
        }
        sc.close();
    }
}