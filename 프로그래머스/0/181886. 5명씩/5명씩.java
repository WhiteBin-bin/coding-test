class Solution {
    public String[] solution(String[] names) {
        
        String[] arr = new String[(names.length + 4) / 5];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = names[idx];
            idx += 5;
        }
        return arr;
    }
}