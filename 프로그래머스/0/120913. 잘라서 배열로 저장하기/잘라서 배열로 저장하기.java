import java.lang.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        // 필요한 배열의 크기를 계산한다. (문자열 길이 / n)
        // (my_str.length() + n - 1) / n 는 '올림' 계산을 정수 연산으로 하는 공식이다.
        // 예: 10, 4 -> (10 + 4 - 1) / 4 = 13 / 4 = 3 (X) -> (10+3)/4 = 3 (X) -> (my_str.length() + n - 1) / n
        // 예: 10, 4 -> (10 + 3) / 4 = 3 (X)
        // 예: 10(길이), 4(n) -> (10 + 4 - 1) / 4 = 13 / 4 = 3 (O) [ "abcd", "efgh", "ij" ]
        // 예: 12(길이), 4(n) -> (12 + 4 - 1) / 4 = 15 / 4 = 3 (O) [ "abcd", "efgh", "ijkl" ]
        int arraySize = (my_str.length() + n - 1) / n;
        
        // 계산된 크기만큼 정답 배열을 생성한다.
        String[] answer = new String[arraySize];
        
        // 정답 배열(answer)의 인덱스로 사용할 변수이다.
        int count = 0;
        
        // 문자열을 n개씩 건너뛰며(i += n) 반복한다.
        // i는 각 조각의 시작 인덱스가 된다.
        for(int i = 0; i < my_str.length(); i += n) {
            
            // 종료 인덱스를 계산한다.
            // i + n (이상적인 종료 위치)과 문자열의 실제 끝(my_str.length()) 중
            // 더 작은 값을 선택 (StringIndexOutOfBoundsException 방지용)
            int end = Math.min(i + n, my_str.length());
            
            // 시작(i)부터 종료(end)까지 문자열을 잘라 answer 배열에 저장한다.
            // count++는 answer[count]에 값을 넣은 후, count 값을 1 증가시킨다.
            answer[count++] = my_str.substring(i, end);
        }
        
        // 완성된 배열을 반환한다.
        return answer;
    }
}