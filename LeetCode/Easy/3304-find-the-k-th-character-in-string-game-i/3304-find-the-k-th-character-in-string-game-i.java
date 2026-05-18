import java.util.*;

class Solution {
    public char kthCharacter(int k) {
        
        String result = build("a", k);

        return result.charAt(k - 1);
    }

    private String build(String current, int k) {

        if (current.length() >= k) {
            return current;
        }

        StringBuilder next = new StringBuilder();

        for (int i = 0; i < current.length(); i++) {

            char ch = (char)(current.charAt(i) + 1);
            
            next.append(ch);
        }

        String newString = current + next.toString();

        return build(newString, k);
    }
}