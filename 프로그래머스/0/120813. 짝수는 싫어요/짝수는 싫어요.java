class Solution {
    public int[] solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] answer = new int[count];
        // answer 배열의 인덱스를 관리할 변수 추가
        int idx = 0; 
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                // i가 아닌 idx를 인덱스로 사용
                answer[idx] = i;
                // 인덱스를 1 증가시켜 다음 칸을 가리키게 함
                idx++; 
            }
        }
        return answer;
    }
}
