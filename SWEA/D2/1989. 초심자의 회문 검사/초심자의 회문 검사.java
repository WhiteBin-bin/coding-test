import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            String str = sc.next();
            String reversed = new StringBuilder(str).reverse().toString();
            
            int result = str.equals(reversed) ? 1 : 0;
            
            System.out.println("#" + tc + " " + result);
        }
    }
}