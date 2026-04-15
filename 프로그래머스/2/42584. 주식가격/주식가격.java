import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        int[] arr = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                arr[idx] = i - idx;
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            arr[idx] = prices.length - 1 - idx;
        }
        
        return arr;
    }
}