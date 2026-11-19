import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(tc);

            for (int i = 0; i < arr.length; i++) {
                sb.append(" ").append(arr[i]); 
            }

            System.out.println(sb.toString());
        }
    }
}
