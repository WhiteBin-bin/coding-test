import java.util.*;

class Solution {
    public int solution(String[] maps) {
        
        int r = maps.length;
        int c = maps[0].length();
        
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];
        
        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {
                
                if (maps[i].charAt(j) == 'S') {
                    start = new int[]{i, j};  
                } else if (maps[i].charAt(j) == 'L') {
                    lever = new int[]{i, j}; 
                } else if (maps[i].charAt(j) == 'E') {
                    exit = new int[]{i, j}; 
                }
            }
        }
        
        int first = bfs(maps, start, lever);
        
        if (first == -1) {
            return -1;
        }
        
        int second = bfs(maps, lever, exit);
        
        if (second == -1) {
            return -1;
        }
        
        return first + second;
    }
    
    private int bfs(String[] maps, int[] start, int[] target) {
        
        int r = maps.length;
        int c = maps[0].length();
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{start[0], start[1]});
        
        int[][] distance = new int[r][c];
        distance[start[0]][start[1]] = 1;
        
        
        while(!que.isEmpty()) {
            
            int[] current = que.poll();
            
            int x = current[0];
            int y = current[1];
        
            if (x == target[0] && y == target[1]) {
                return distance[x][y] - 1;
            }
            
            for (int i = 0; i < 4; i++) {
                
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                    continue;
                }
                
                if (maps[nx].charAt(ny) == 'X') {
                    continue;
                }
                
                if (distance[nx][ny] != 0) {
                    continue;
                }
                
                distance[nx][ny] = distance[x][y] + 1;
                
                que.offer(new int[]{nx, ny});
            }
        }
        
        return -1;
    }
}