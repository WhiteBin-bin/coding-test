import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[1001];
        A[0] = 1;
        A[1] = 1;

        for (int i = 2; i <= 1000; i++) {
            int candidate = 1; 
            
            while (true) {
                boolean isValid = true;

                for (int k = 1; i - 2 * k >= 0; k++) {
                    if (A[i - k] - A[i - 2 * k] == candidate - A[i - k]) {
                        isValid = false;
                        break;
                    }
                }
                
                if (isValid) {
                    A[i] = candidate;
                    break;
                }
                
                candidate++;
            }
        }

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            System.out.println(A[n]);
        }
    }
}
