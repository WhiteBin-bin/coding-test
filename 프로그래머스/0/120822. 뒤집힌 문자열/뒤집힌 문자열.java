class Solution {
    public String solution(String my_string) {
        
        String str = "";
        for (int i = my_string.length() - 1; 0 <= i; i--){
            str += my_string.charAt(i);
        }
        return str;
    }
}