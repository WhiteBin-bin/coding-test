import java.util.*;

class Solution {
    
    static class Song {
        int index;
        int play;
        
        Song(int index, int play) {
            this.index = index;
            this.play = play;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String, Integer> genreTotalMap = new HashMap<>();
        Map<String, List<Song>> songMap = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            
            genreTotalMap.put(genres[i], genreTotalMap.getOrDefault(genres[i], 0) + plays[i]);
            songMap.putIfAbsent(genres[i], new ArrayList<>());
            songMap.get(genres[i]).add(new Song(i, plays[i]));   
        }
        
        List<String> genreList = new ArrayList<>(genreTotalMap.keySet());
        genreList.sort((a, b) -> genreTotalMap.get(b) - genreTotalMap.get(a));
        
        List<Integer> result = new ArrayList<>();
        
        for (genre : genreList) {
            
        }
        
    }
}