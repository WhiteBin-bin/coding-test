class Solution {
    public int[] solution(int[] numbers) {
        
        for(int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = numbers[i - 1] * 2;
        }
        
        return numbers;
    }
}