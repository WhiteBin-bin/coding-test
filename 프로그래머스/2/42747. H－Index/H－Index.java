import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);

        int count = 0;
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;

            if (citations[i] >= h) {
                count = h;
                break;
            }
        }

        return count;
    }
}