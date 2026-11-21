import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();

			int total1 = d1;
			for (int i = 1; i < m1; i++) {
				total1 += days[i];
			}

			int total2 = d2;
			for (int i = 1; i < m2; i++) {
				total2 += days[i];
			}

			int answer = total2 - total1 + 1;

			System.out.println("#" + tc + " " + answer);
		}

		sc.close();
	}
}