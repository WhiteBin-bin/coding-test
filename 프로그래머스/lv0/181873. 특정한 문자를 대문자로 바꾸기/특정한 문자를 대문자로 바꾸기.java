class Solution {
    public String solution(String my_string, String alp) {
        String str = my_string.replace(alp, alp.toUpperCase());
        return str;
    }
}