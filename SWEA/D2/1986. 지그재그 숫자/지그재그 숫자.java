import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int tc = 1; tc <= T; tc++) {

            int num = sc.nextInt();


            if (count % 2 == 0) {
                sum += num;
                count++;
            } else {
                sum -= num;
                count++;
            }
            System.out.println("#" + tc + " " + sum);
        }
    }
}