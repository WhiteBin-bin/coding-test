class Solution {
    public String solution(int age) {
        
        String str = "";
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i = 0; i < ageArr.length; i++) {
            str += age962.charAt(Integer.valueOf(ageArr[i]));
        }
        return str;
    }
}