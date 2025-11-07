class Solution {
    public int[] solution(int money) {
        
        // 아메리카노 값 변수로 선언
        int americano = 5500;
        
        // 크기가 2인 배열 선언해서 아메리카노 잔 수와 남는 돈 받는다.
        int[] answer = new int[2];
        
        // 0번째 인덱스에 나누기 해서 나온 값 저장
        answer[0] = money / americano;
        
        // 1번째 인덱스에 나누기 하고 나머지 값 저장
        answer[1] = money % americano;
        
        return answer;
    }
}