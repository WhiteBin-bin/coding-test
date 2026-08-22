class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        boolean[] isExist = new boolean[10];
        
        for (int i = 0; i < numbers.length; i++) {
            isExist[numbers[i]] = true;
        }

        for (int none = 0; none <= 9; none++) {
            if (!isExist[none]) {
                sum += none;
            }
        }
        
        return sum;
    }
}
