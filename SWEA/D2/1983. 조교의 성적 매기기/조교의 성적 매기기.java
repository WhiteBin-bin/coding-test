import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] scores = new int[N];

            for (int i = 0; i < N; i++) {
                int mid = sc.nextInt();
                int fin = sc.nextInt();
                int hw = sc.nextInt();
                scores[i] = mid * 35 + fin * 45 + hw * 20;
            }

            int targetScore = scores[K - 1];
            int higherCount = 0;
            for (int i = 0; i < N; i++) {
                if (scores[i] > targetScore) {
                    higherCount++;
                }
            }

            int gradeIndex = higherCount / (N / 10);

            System.out.println("#" + tc + " " + grades[gradeIndex]);
        }
    }
}