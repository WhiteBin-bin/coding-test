import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        
        return bfs(begin, target, words);
    }
    
    private int bfs(String begin, String target, String[] words) {
        
        boolean[] visited = new boolean[words.length];
        
        Queue<String> que = new ArrayDeque<>();
        
        que.offer(begin);
        
        int count = 0;
        
        while (!que.isEmpty()) {
            
            int size = que.size();
            
            for (int i = 0; i < size; i++) {
                
                String current = que.poll();
                
                if (current.equals(target)) {
                    return count;
                }
                
                for (int j = 0; j < words.length; j++) {
                    
                    if (visited[j]) {
                        continue;
                    }
                    
                    if (!canChange(current, words[j])) {
                        continue;
                    }
                    
                    visited[j] = true;
                    que.offer(words[j]);
                }
            }
            
            count++;
        }
        
        return 0;
    }
    
    private boolean canChange(String current, String next) {

        int count = 0;

        for (int i = 0; i < current.length(); i++) {

            if (current.charAt(i) != next.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }
    
}