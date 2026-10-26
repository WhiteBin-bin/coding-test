class Solution {
    
    private int toSeconds(String timeStr) {
        String[] split = timeStr.split(":");
        int m = Integer.parseInt(split[0]);
        int s = Integer.parseInt(split[1]);
        return m * 60 + s;
    }
    
    private String toStringTime(int totalSeconds) {
        int m = totalSeconds / 60;
        int s = totalSeconds % 60;
        return String.format("%02d:%02d", m, s);
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int totalLen = toSeconds(video_len);
        int current = toSeconds(pos);
        int opStart = toSeconds(op_start);
        int opEnd = toSeconds(op_end);
        
        if (current >= opStart && current <= opEnd) {
            current = opEnd;
        }
        
        for (String command : commands) {
            if (command.equals("next")) {
                current += 10;
                if (current > totalLen) { 
                    current = totalLen;
                }
            } else if (command.equals("prev")) {
                current -= 10;
                if (current < 0) {
                    current = 0;
                }
            }
            
            if (current >= opStart && current <= opEnd) {
                current = opEnd;
            }
        }
        
        return toStringTime(current);
    }
}