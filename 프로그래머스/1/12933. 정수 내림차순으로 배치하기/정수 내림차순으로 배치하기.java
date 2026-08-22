import java.util.*;

class Solution {
    public long solution(long n) {
        
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        
        String sortedStr = new StringBuilder(new String(chars)).reverse().toString();
        return Long.parseLong(sortedStr);
    }
}