import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			String year = str.substring(0, 4);
			String month = str.substring(4, 6);
			String day = str.substring(6);
            
			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);
            
			if (m >= 1 && m <= 12 && d >= 1 && d <= daysInMonth[m]) {
				System.out.println("#" + test_case + " " + year + "/" + month + "/" + day);
			} else {
				System.out.println("#" + test_case + " " + "-1");
			}
		}
	}
}