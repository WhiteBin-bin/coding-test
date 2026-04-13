import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        char[] arr = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}