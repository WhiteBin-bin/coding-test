import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String current = words[i];
            
            if (set.contains(current) || prev.charAt(prev.length() - 1) != current.charAt(0)) {
                
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                
                return new int[]{person, turn};
            }
            
            set.add(current);
        }
        
        return new int[]{0, 0};
    }
}