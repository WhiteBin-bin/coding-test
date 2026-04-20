import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int[][] arr = new int[rank.length][2];
        for (int i = 0; i < rank.length; i++) {
            arr[i][0] = rank[i];
            arr[i][1] = i;
        }
        
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int[] pick = new int[3];
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (attendance[arr[i][1]]) {
                pick[index++] = arr[i][1];
                count++;
            }
            if (count == pick.length) {
                break;
            }
        }
        int answer = 10000 * pick[0] + 100 * pick[1] + pick[2];
        return answer;
    }
}