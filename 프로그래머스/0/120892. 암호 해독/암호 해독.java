class Solution {
    public String solution(String cipher, int code) {
        
        String str = "";
        
        for (int i = code - 1; i < cipher.length(); i += code) {
            str += cipher.charAt(i);
        }
        
        return str;
    }
}