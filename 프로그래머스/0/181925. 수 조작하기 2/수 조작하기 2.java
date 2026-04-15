class Solution {
    public String solution(int[] numLog) {
        
        String str = "";
        
        for (int i = 0; i < numLog.length - 1; i++) {
            int j = numLog[i + 1] - numLog[i];
            
            if (j == 1) {
                str += "w";
            } else if (j == -1) {
                str += "s";
            } else if (j == 10) {
                str += "d";
            } else if (j == -10) {
                str += "a";
            }
        }
        
        return str;
    }
}
