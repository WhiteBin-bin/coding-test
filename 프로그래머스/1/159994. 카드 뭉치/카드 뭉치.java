import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        
        for (String card : cards1) {
            q1.offer(card);
        }
        
        for (String card : cards2) {
            q2.offer(card);
        }
        
        for (String word : goal) {
            if (!q1.isEmpty() && q1.peek().equals(word)) {
                q1.poll();
            } else if (!q2.isEmpty() && q2.peek().equals(word)) {
                q2.poll();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}