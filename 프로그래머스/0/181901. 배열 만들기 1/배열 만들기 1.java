class Solution {
    public int[] solution(int n, int k) {
        
        int[] arr = new int[n / k];
        
        for(int i = 1; i <= n / k; i++){
            arr[i - 1] = k * i;
        }
        
        return arr;
    }
}