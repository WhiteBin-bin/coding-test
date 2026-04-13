import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> rank = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for (String name : callings) {
            int currentIdx = rank.get(name);
            int frontIdx = currentIdx - 1;
            
            String frontPlayer = players[frontIdx];
            
            players[frontIdx] = name;
            players[currentIdx] = frontPlayer;
            
            rank.put(name, frontIdx);
            rank.put(frontPlayer, currentIdx);
        }
        
        return players;
    }
}