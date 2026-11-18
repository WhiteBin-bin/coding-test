import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int unit : units) {
                sb.append(n / unit).append(" ");
                n %= unit;
            }
            System.out.println("#" + tc);
            System.out.println(sb.toString().trim());
        }
    }
}