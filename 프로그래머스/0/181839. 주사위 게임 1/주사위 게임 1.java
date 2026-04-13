import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int result = 0;

        if (a % 2 == 1 && b % 2 == 1) {
            result = a * a + b * b;
        } else if (a % 2 == 1 || b % 2 == 1) {
            result = 2 * (a + b); 
        } else {
            result = Math.abs(a - b);
        }

        return result;
    }
}