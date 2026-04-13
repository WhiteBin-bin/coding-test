class Solution {
    public String solution(String myString) {
        
        myString = myString.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                sb.append('A');
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}