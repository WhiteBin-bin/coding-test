class Solution {
    public String solution(String rny_string) {
        String str = "";
        
        for (char c : rny_string.toCharArray()) {
            if (c == 'm') {
                str += "rn";
            } else {
                str += c;
            }
        }
        
        return str;
    }
}