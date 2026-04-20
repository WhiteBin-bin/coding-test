import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        int answer = 0;
        int[] before = arr.clone();
        
        while (true) {
            int[] current = new int[before.length];
            
            for (int i = 0; i < before.length; i++) {
                if (before[i] >= 50 && before[i] % 2 == 0) {
                    current[i] = before[i] / 2;
                } else if (before[i] < 50 && before[i] % 2 != 0) {
                    current[i] = before[i] * 2 + 1;
                } else {
                    current[i] = before[i];
                }
            }
            
            if (Arrays.equals(before, current)) {
                break;
            }
            
            before = current;
            answer++;
        }
        
        return answer;
    }
}
