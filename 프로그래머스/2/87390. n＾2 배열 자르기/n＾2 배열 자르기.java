import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        
        // 1. 정답 배열의 크기는 (right - left + 1) 이다.
        int size = (int)(right - left + 1);
        int[] answer = new int[size];
        
        // 2. left부터 right까지의 인덱스만 순회한다.
        // answer 배열에 값을 채우기 위한 인덱스 'idx'
        int idx = 0; 
        for(long k = left; k <= right; k++) {
            
            // 3. 1D 인덱스 k를 2D 인덱스 (i, j)로 변환
            long i = k / n; // 행
            long j = k % n; // 열
            
            // 4. 규칙에 따라 값을 계산하여 answer 배열에 저장
            // k번째 값 = Math.max(i, j) + 1
            answer[idx++] = (int)(Math.max(i, j) + 1);
        }
        
        return answer;
    }
}