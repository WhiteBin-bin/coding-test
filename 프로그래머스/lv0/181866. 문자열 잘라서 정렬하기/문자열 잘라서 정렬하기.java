import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (String s : arr) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}