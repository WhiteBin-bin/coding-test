class Solution {
    public int[] solution(int[] numbers) {
        // numbers의 길이만큼 배열을 하나 선언한다.
        int[] answer = new int[numbers.length];
        // numbers의 길이만큼 반복문을 돌린다.
        for(int i = 0; i < numbers.length; i++) {
            // numbers 배열에 인덱싱에 있는 값에 2배를 한 값을 answer에 저장한다.
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}