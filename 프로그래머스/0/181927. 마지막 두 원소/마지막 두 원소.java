class Solution {
    public int[] solution(int[] num_list) {
        
        int[] arr = new int[num_list.length + 1];
        
        int last = num_list[num_list.length - 1];
        int lastb = num_list[num_list.length - 2]; 

        for(int i = 0; i < num_list.length; i++){
            arr[i] = num_list[i];
        }
        if (last > lastb) {
            arr[num_list.length] = last - lastb;
        } else {
            arr[num_list.length] = last * 2;
        }
        
        return arr;
    }
}