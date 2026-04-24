import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        int num = 0;
        Arrays.sort(array);
        
        for (int i = 1 ; i < array.length ; i++){
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])){
                array[0] = array[i];
            }
        }
        num = array[0];
        return num;
    }
}