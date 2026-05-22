class Solution {

    public int countBinarySubstrings(String s) {

        int prev = 0;
        int curr = 1;
        int answer = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {

                curr++;

            } else {

                answer += Math.min(prev, curr);

                prev = curr;
                curr = 1;
            }
        }

        answer += Math.min(prev, curr);

        return answer;
    }
}