import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int numRobots = routes.length;
        int numTargets = routes[0].length;
        
        Queue<int[]>[] robotPaths = new LinkedList[numRobots];
        for (int i = 0; i < numRobots; i++) {
            robotPaths[i] = new LinkedList<>();
        }
        
        for (int i = 0; i < numRobots; i++) {

            int startPointIdx = routes[i][0] - 1;
            int curR = points[startPointIdx][0];
            int curC = points[startPointIdx][1];
            
            robotPaths[i].add(new int[]{curR, curC});
            

            for (int j = 1; j < numTargets; j++) {
                int nextPointIdx = routes[i][j] - 1;
                int targetR = points[nextPointIdx][0];
                int targetC = points[nextPointIdx][1];
                
                while (curR != targetR) {
                    if (curR < targetR) curR++;
                    else curR--;
                    robotPaths[i].add(new int[]{curR, curC});
                }

                while (curC != targetC) {
                    if (curC < targetC) curC++;
                    else curC--;
                    robotPaths[i].add(new int[]{curR, curC});
                }
            }
        }
        
        int dangerCount = 0;

        while (true) {
            boolean anyRobotLeft = false;
            
            Map<String, Integer> positionMap = new HashMap<>();
            
            for (int i = 0; i < numRobots; i++) {
                if (!robotPaths[i].isEmpty()) {
                    int[] curPos = robotPaths[i].poll();
                    String posKey = curPos[0] + "," + curPos[1];
                    
                    positionMap.put(posKey, positionMap.getOrDefault(posKey, 0) + 1);
                    anyRobotLeft = true;
                }
            }

            if (!anyRobotLeft) {
                break;
            }
            
            for (int count : positionMap.values()) {
                if (count >= 2) {
                    dangerCount++;
                }
            }
        }
        
        return dangerCount;
    }
}
