import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int line = sc.nextInt();
            int[][] arr = new int[line][line];

            for (int j = 0; j < line; j++) {
                for (int k = 0; k <= j; k++) {
                    if (k == 0 || k == j) {
                        arr[j][k] = 1;
                    } else {
                        arr[j][k] = arr[j - 1][k - 1] + arr[j - 1][k];
                    }
                }
            }

            System.out.println("#" + i);
            for (int j = 0; j < line; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
