import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String str = sc.next();
            int answer = 0;

            for (int i = 1; i <= 10; i++) {
                String first = str.substring(0, i);
                String second = str.substring(i, i * 2);

                if (first.equals(second)) {
                    answer = i;
                    break;
                }
            }

            System.out.println("#" + tc + " " + answer);
        }
    }
}
