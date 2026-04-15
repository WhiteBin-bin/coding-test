import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (remain + speeds[i] - 1) / speeds[i];
            que.offer(day);
        }
        
        
        while (!que.isEmpty()) {
            int current = que.poll(); 
            int count = 1;
            
            while (!que.isEmpty() && que.peek() <= current) {
                que.poll();
                count++;
            }
            
            list.add(count);
        }
        
        int[] arr = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}