import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {

        Map<Character, Integer> keyMapInfo = new HashMap<>();
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                int pressCount = i + 1;
                
                keyMapInfo.put(ch, Math.min(keyMapInfo.getOrDefault(ch, Integer.MAX_VALUE), pressCount));
            }
        }
        
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPress = 0;
            boolean isPossible = true;
            
            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                
                if (keyMapInfo.containsKey(ch)) {
                    totalPress += keyMapInfo.get(ch);
                } else {
                    isPossible = false;
                    break;
                }
            }
            
            answer[i] = isPossible ? totalPress : -1;
        }
        
        return answer;
    }
}
