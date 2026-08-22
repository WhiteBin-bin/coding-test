import java.util.*;

class Solution {

    public int solution(String begin, String target, String[] words) {

        boolean[] visited = new boolean[words.length];
        Queue<Word> queue = new LinkedList<>();

        queue.add(new Word(begin, 0));

        while (!queue.isEmpty()) {

            Word cur = queue.poll();

            for (int i = 0; i < words.length; i++) {

                if (!visited[i] && canChange(cur.word, words[i])) {

                    if (words[i].equals(target)) {
                        return cur.depth + 1;
                    }

                    visited[i] = true;
                    queue.add(new Word(words[i], cur.depth + 1));
                }
            }
        }

        return 0;
    }

    private boolean canChange(String current, String next) {

        int diff = 0;

        for (int i = 0; i < current.length(); i++) {

            if (current.charAt(i) != next.charAt(i)) {
                diff++;
            }
        }

        return diff == 1;
    }

    class Word {
        String word;
        int depth;

        Word(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
}