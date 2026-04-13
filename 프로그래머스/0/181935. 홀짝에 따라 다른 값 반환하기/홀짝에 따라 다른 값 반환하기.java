class Solution {
    public int solution(int n) {
        int sum = 0;
        if(n % 2 == 1){
            for(int i = 1; i <= n; i += 2){
                sum += i;
            }
        }
        else{
            for(int j = 2; j <= n; j += 2){
                sum += j*j;
            }
        }
        return sum;
    }
}