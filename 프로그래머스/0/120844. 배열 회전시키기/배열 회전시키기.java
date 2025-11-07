class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] answer = new int[numbers.length];
        
        switch(direction) {
            case "right":
                
                // 맨 뒤의 원소를 answer 맨 앞에 넣기
                answer[0] = numbers[numbers.length - 1];
                
                // 나머지 원소들을 한 칸씩 뒤로 밀어서 넣기 (for문 사용)
                for (int i = 0; i < numbers.length - 1; i++) {
                    answer[i + 1] = numbers[i];
                }
                
                break;
                
            case "left":
                
                // 맨 앞의 원소를 answer 맨 뒤에 넣기
                answer[answer.length - 1] = numbers[0];
                
                // 나머지 원소들을 한 칸씩 앞으로 당겨서 넣기 (for문 사용)
                for (int i = 1; i < numbers.length; i++) {
                    answer[i - 1] = numbers[i];
                }
                
                break;
        }

        return answer;
    }
}