import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;

        for (int i = 0; i < wires.length; i++) {
            List<Integer>[] graph = new ArrayList[n + 1];

            for (int j = 1; j <= n; j++) {
                graph[j] = new ArrayList<>();
            }

            for (int j = 0; j < wires.length; j++) {
                if (i == j) continue;

                int a = wires[j][0];
                int b = wires[j][1];

                graph[a].add(b);
                graph[b].add(a);
            }

            boolean[] visited = new boolean[n + 1];

            int count = dfs(1, graph, visited);
            int other = n - count;

            answer = Math.min(answer, Math.abs(count - other));
        }

        return answer;
    }

    private int dfs(int node, List<Integer>[] graph, boolean[] visited) {
        visited[node] = true;

        int count = 1;

        for (int next : graph[node]) {
            if (!visited[next]) {
                count += dfs(next, graph, visited);
            }
        }

        return count;
    }
}