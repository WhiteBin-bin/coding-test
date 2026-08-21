class Solution {
    public int solution(int n, int m, int[] section) {
        
        int count = 0;
        int paintedUntil = 0;
        
        for (int s : section) {
            
            if (s > paintedUntil) {
                paintedUntil = s + m - 1;
                count++;
            }
        }
        
        return count;
    }
}