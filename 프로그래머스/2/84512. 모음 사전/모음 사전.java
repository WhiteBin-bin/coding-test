import java.util.*;

class Solution {
    
    List<String> list = new ArrayList<>();
    char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        
        dfs("");
        
        return list.indexOf(word) + 1;
        
    }
    
    private void dfs(String str) {
        
        if (str.length() == 5) {
            return;
        }
        
        for (char vowel : vowels) {
            
            String next = str + vowel;
            list.add(next);
            dfs(next);
        }
    }
}