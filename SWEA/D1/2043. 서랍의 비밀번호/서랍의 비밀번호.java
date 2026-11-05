import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        int start_number = sc.nextInt();

        System.out.println(answer - start_number + 1);
	}
}