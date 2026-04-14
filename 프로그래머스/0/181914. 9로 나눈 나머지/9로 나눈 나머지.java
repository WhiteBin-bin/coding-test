class Solution {
    public int solution(String number) {
        int sum = 0;
        for (String s: number.split("")) {
            sum += Integer.parseInt(s);
        }
        sum %= 9;
        return sum;
    }
}