class Solution {
    public int solution(int n) {
        
        int num = 0;
        for(int i = 1; i <= n * 6; i++){
            if (6 * i % n == 0) {
				num = i;
				break;
            }
        }
        return num;
    }
}