import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] a = s.toCharArray();
        for(char c : a) {
            if(c  == '(') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty() || stack.pop() == c) { // 1. 스택이 비어있는지 확인
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}