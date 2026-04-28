class Solution {
    public int solution(int[] sides) {
        
        int a = sides[0];
        int b = sides[1];
        
        int minSide = Math.abs(a - b) + 1;
        int maxSide = Math.max(a, b);
        int case1 = maxSide - minSide + 1;
        
        int minNew = Math.max(a, b) + 1;
        int maxNew = a + b - 1;
        int case2 = (maxNew - minNew) + 1;
        
        return case1 + case2;
    }
}
