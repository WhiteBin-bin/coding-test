class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        for (int i = 0; i < 2; i++) {
            if (dot[0] > 0 && dot[1] > 0) {
                answer = 1;
            } else if(dot[0] < 0 && dot[1] > 0) {
                answer = 2;
            } else if(dot[0] < 0 && dot[1] < 0) {
                answer = 3;
            } else {
                answer = 4;
            }
        }
        return answer;
    }
}