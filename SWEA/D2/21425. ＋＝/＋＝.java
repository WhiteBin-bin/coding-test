import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
        	long a = sc.nextInt();
            long b = sc.nextInt();
            long n = sc.nextInt();
            
            int count = 0;
            
            while (a <= n && b <= n) {
            	
                if (a < b) {
                	a += b;
                } else {
                	b += a;
                }
                
                count++;
            }
            
          	System.out.println(count);
        }
    }
}
