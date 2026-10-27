class Solution {
    public int solution(int n, int[][] computers) {
        
        boolean[] visited = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    private void dfs(int current, int n, int[][] computers, boolean[] visited) {
        
        visited[current] = true;
        
        for (int i = 0; i < n; i++) {
            
            if (computers[current][i] == 1 && !visited[i]) {
                dfs(i, n, computers, visited);
            }
        }
    }
}