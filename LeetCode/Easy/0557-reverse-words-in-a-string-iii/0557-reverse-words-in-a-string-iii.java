class Solution {
    public String reverseWords(String s) {

        String[] str = s.split(" ");
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length; i++) {

            StringBuffer bf = new StringBuffer(str[i]);

            answer.append(bf.reverse());

            if (i != str.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}