class Solution {
    public int solution(int i, int j, int k) {
        
        int count = 0;
        String str = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String value = String.valueOf(l);
            if (value.contains(str)) {
                String[] arr = value.split("");
                for (String alpha : arr) {
                    if (alpha.equals(str)) count++;
                }
            }
        }
        return count;
    }
}