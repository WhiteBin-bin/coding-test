class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int h = park.length;
        int w = park[0].length();
        
        int currentR = 0;
        int currentC = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    currentR = i;
                    currentC = j;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            
            String[] parts = route.split(" ");
            String dir = parts[0];
            int dist = Integer.parseInt(parts[1]);
            
            int dr = 0;
            int dc = 0;
            
            if (dir.equals("N")) {
                dr = -1;
            }
            else if (dir.equals("S")) {
                dr = 1;
            }
            else if (dir.equals("W")) {
                dc = -1;
            }
            else if (dir.equals("E")) {
                dc = 1;
            }
            
            int nextR = currentR;
            int nextC = currentC;
            boolean isValid = true;
            
            for (int i = 0; i < dist; i++) {
                nextR += dr;
                nextC += dc;
                
                if (nextR < 0 || nextR >= h || nextC < 0 || nextC >= w) {
                    isValid = false;
                    break;
                }

                if (park[nextR].charAt(nextC) == 'X') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                currentR = nextR;
                currentC = nextC;
            }
        }

        return new int[]{currentR, currentC};
    }
}
