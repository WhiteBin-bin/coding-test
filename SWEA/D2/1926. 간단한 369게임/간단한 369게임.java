import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == '3' || ch == '6' || ch == '9') {
                    count++;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
            } else {
                for (int j = 0; j < count; j++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            }
        }
    }
}
