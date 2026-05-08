class Solution {
    public int strStr(String haystack, String needle) {
        
        int right = haystack.length();
        int size = needle.length();

        if (right < size) {
            return -1;
        }

        for (int i = 0; i <= right - size; i++) {
            
            if (haystack.substring(i, i + size).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}