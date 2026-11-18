import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            int totalMin = m1 + m2;
            int totalHour = h1 + h2 + (totalMin / 60);

            int finalMin = totalMin % 60;
            int finalHour = (totalHour - 1) % 12 + 1;

            System.out.println("#" + tc + " " + finalHour + " " + finalMin);
        }
    }
}