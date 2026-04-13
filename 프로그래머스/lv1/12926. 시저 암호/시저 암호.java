class Solution {
    public String solution(String s, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            
            if (ch == ' ') {
                sb.append(' ');
            } 
            else if (Character.isLowerCase(ch)) {
                sb.append((char) ('a' + (ch - 'a' + n) % 26));
            } 
            else if (Character.isUpperCase(ch)) {
                sb.append((char) ('A' + (ch - 'A' + n) % 26));
            }
        }
        
        return sb.toString();
    }
}