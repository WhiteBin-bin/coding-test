import java.util.*;

class Solution {

    public String[] solution(String[][] tickets) {

        boolean[] visited = new boolean[tickets.length];
        List<String> path = new ArrayList<>();

        Arrays.sort(tickets, (a, b) -> {
            int compare = a[0].compareTo(b[0]);

            if (compare == 0) {
                return a[1].compareTo(b[1]);
            }

            return compare;
        });

        path.add("ICN");

        dfs("ICN", tickets, visited, path, 0);

        return path.toArray(new String[0]);
    }

    private boolean dfs(String current, String[][] tickets,
                        boolean[] visited, List<String> path, int count) {

        if (count == tickets.length) {
            return true;
        }

        for (int i = 0; i < tickets.length; i++) {

            if (visited[i]) {
                continue;
            }

            if (!tickets[i][0].equals(current)) {
                continue;
            }

            visited[i] = true;
            path.add(tickets[i][1]);

            if (dfs(tickets[i][1], tickets, visited, path, count + 1)) {
                return true;
            }

            path.remove(path.size() - 1);
            visited[i] = false;
        }

        return false;
    }
}