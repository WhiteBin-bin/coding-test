import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String term : terms) {
            String[] t = term.split(" ");
            map.put(t[0], Integer.parseInt(t[1]));
        }
        
        int todayDay = toDays(today);
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            
            String date = p[0];
            String type = p[1];
            
            int startDay = toDays(date);
            int term = map.get(type);
            
            int expireDay = startDay + (term * 28);
            
            if (todayDay >= expireDay) {
                result.add(i + 1);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    private int toDays(String date) {
        String[] d = date.split("\\.");
        
        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        
        return year * 12 * 28 + month * 28 + day;
    }
}