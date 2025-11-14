import java.util.*;

class Solution
{
    public int solution(String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 1. 스택이 비어 있지 않고, 현재 문자화 스택의 맨 뒤 문자가 같으면
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 2. 스택의 맨 뒤 문자 제거
            }
            else {
                stack.push(c); // 3. 스택에 현재 문자 추가
            }
        }
        
        return stack.isEmpty() ? 1 : 0; // 4. 스택이 비어 있으면 1, 그렇지 않으면 0
    }
}