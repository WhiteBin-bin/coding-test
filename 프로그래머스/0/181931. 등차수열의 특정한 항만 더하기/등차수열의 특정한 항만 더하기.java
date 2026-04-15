class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int num = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                num += (a + (i * d));
            }
        }
        return num;
    }
}