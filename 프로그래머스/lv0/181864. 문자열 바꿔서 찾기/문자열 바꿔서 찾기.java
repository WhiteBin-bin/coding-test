class Solution {
	public int solution(String myString, String pat) {
    	
        int num = 0;
        
        String str = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        
        if(str.contains(pat)) {
        	num = 1;
        }
        return num;
    }
}