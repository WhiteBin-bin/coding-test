import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long maxProfit = 0;
            int maxPrice = 0;

            int n = sc.nextInt();
            int[] prices = new int[n];
            for (int j = 0; j < n; j++) {
                prices[j] = sc.nextInt();
            }

            for (int j = n - 1; j >= 0; j--) {
                if (prices[j] > maxPrice) {
                    maxPrice = prices[j];
                } else {
                    maxProfit += (maxPrice - prices[j]);
                }
            }

            System.out.println("#" + (i + 1) + " " + maxProfit);
        }
    }
}
