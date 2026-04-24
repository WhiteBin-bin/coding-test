class Solution {
    public String solution(String my_string) {
        
        String str = "";
                
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i)) == i) {
                str += my_string.charAt(i);
            }
        }
        return str;
    }
}