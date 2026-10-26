class Solution {
    
    private boolean isPossible(int[] diffs, int[] times, long limit, int level) {
        long totalTime = 0;
        
        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int timeCurr = times[i];
            int timePrev = (i == 0) ? 0 : times[i - 1];
            
            if (diff <= level) {
                totalTime += timeCurr;
            } else {
                long repeat = diff - level;
                totalTime += repeat * (timeCurr + timePrev) + timeCurr;
            }
            
            if (totalTime > limit) {
                return false;
            }
        }
        
        return true;
    }

    public int solution(int[] diffs, int[] times, long limit) {
        
        int left = 1;  // 4. left 변수도 정상적으로 1로 초기화
        int right = 1;
        
        for (int diff : diffs) {
            right = Math.max(right, diff);
        }
        
        int answer = right;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (isPossible(diffs, times, limit, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return answer;
    }
}
