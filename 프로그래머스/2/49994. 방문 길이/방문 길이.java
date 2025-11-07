import java.util.*;

class Solution {
    
    // 1. 좌표 평면을 벗어나는지 체크하는 메서드
    // 논리적 좌표 (문제): (-5, -5) ~ (5, 5) 배열 인덱스 (코드): (0, 0) ~ (10, 10) 
    // 이렇게 해야 자바에서 배열이 음수가 될 수 없는 문제를 해결이 가능하다.
    public static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }
    
    // 2. 좌표 결정을 위한 해시맵 생성
    private static final HashMap<Character, int[]> location = new HashMap<>();
    
    // 커맨드 마다 움직이는 값에 대해서 미리생성 
    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }
    
    public int solution(String dirs) {
        initLocation();
        int x = 5, y = 5;
        // 3. 겹치는 좌표를 1개로 처리하기 위함이다.
        HashSet<String> answer = new HashSet<>();
        // 4. 주어진 명령어로 움직이면서 좌표를 저장한다.
        for(int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            // 5. 벗어난 좌표는 인정하지 않기 위해서이다.
            if(!isValidMove(nx, ny)) {
                continue;
            }
            
            // 6. A에서 B로 간 경우 B에서 A도 추가해야 한다.(총 경로의 개수는 방향성이 없다.)
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);
            
            // 7. 좌표를 이동했으므로 업데이트 해야한다.
            x = nx;
            y = ny;
            
        }
        return answer.size() / 2;
    }
}