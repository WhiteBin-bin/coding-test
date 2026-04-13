class Solution {
    public String solution(String my_string, int[] index_list) {
        
        String str = "";
        
        for (int i = 0; i < index_list.length; i++) {
            
            str += my_string.charAt(index_list[i]);
        }
        
        return str;
    }
}