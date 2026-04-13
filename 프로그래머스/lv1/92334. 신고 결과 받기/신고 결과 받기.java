import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, Set<String>> reportedBy = new HashMap<>();
        
        for (int j = 0; j < report.length; j++) {
            String[] str = report[j].split(" ");
            String reporter = str[0];
            String reported = str[1];

            reportedBy.putIfAbsent(reported, new HashSet<>());
            reportedBy.get(reported).add(reporter);
        }
        
        Map<String, Integer> mailCount = new HashMap<>();
        
        for (String id : id_list) {
            mailCount.put(id, 0);
        }
        
        for (String reported : reportedBy.keySet()) {
            Set<String> reporters = reportedBy.get(reported);
            
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    mailCount.put(reporter, mailCount.get(reporter) + 1);
                }
            }
        }
        
        int[] answer = new int[id_list.length];
        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }
        
        return answer;
    }
}