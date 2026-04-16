import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int str = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (str > k) {
                list.add(str);
            }
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}