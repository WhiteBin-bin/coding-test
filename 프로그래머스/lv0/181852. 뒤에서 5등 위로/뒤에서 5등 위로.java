import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        
        int[] arr = new int[num_list.length - 5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num_list[i + 5];
        }
        
        return arr;
    }
}