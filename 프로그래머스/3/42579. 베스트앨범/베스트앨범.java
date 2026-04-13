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
        
        for (String genre : genreList) {
            List<Song> songs = songMap.get(genre);
            
            songs.sort((a, b) -> {
                if (b.play == a.play) {
                    return a.index - b.index;
                }
                return b.play - a.play;
            });
            
            result.add(songs.get(0).index);
            
            if (songs.size() > 1) {
                result.add(songs.get(1).index);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}