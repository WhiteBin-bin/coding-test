import java.util.*;

class Solution {

    Set<Integer> set = new HashSet<>();

    public int totalNumbers(int[] digits) {

        boolean[] visited = new boolean[digits.length];

        dfs(digits, visited, 0, 0);

        return set.size();
    }

    private void dfs(int[] digits, boolean[] visited, int depth, int num) {

        if (depth == 3) {

            if (num % 2 == 0) {
                set.add(num);
            }

            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (visited[i]) {
                continue;
            }

            if (depth == 0 && digits[i] == 0) {
                continue;
            }

            visited[i] = true;

            dfs(digits, visited, depth + 1, num * 10 + digits[i]);

            visited[i] = false;
        }
    }
}