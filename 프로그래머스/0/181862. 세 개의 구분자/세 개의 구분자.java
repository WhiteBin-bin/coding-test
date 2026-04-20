class Solution {
    public String[] solution(String myStr) {
        
        String[] arr;
        String s = myStr.replaceAll("[a-c]", " ");
        if (s.trim().isEmpty()) {
            arr = new String[]{"EMPTY"};
        } else {
            arr = s.trim().split("\\s+");
        }
        return arr;
    }
}