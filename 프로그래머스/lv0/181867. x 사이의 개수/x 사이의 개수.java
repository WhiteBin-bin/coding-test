class Solution {
    public int[] solution(String myString) {
        
        String[] str = myString.split("x", -1);
        int[] num = new int[str.length];
        
        for (int i = 0; i < str.length; i++) {
            num[i] = str[i].length();
        }
        
        return num;
    }
}