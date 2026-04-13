import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int maxCount = 0;
        int answer = -1;
        boolean isDuplicate = false;
        
        for (int key : map.keySet()) {
            int count = map.get(key);
            
            if (count > maxCount) {
                maxCount = count;
                answer = key;
                isDuplicate = false;
            } else if (count == maxCount) {
                isDuplicate = true;
            }
        }
        
        return isDuplicate ? -1 : answer;
    }
}