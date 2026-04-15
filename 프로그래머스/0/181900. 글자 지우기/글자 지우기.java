class Solution {
    public String solution(String my_string, int[] indices) {
        
        String str = "";
        
        String[] arr = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = "";
        }

        for (String x : arr) {
            str += x;
        }
        return str;
    }
}