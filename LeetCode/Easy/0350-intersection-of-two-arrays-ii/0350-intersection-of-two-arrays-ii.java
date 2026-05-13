import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int nums1P = 0;
        int nums2P = 0;

        while (nums1P < nums1.length && nums2P < nums2.length) {

            if (nums1[nums1P] == nums2[nums2P]) {
                
                list.add(nums1[nums1P]);
                nums1P++;
                nums2P++;

            } else if (nums1[nums1P] < nums2[nums2P]) {

                nums1P++;
                
            } else {

                nums2P++;
            }
        }


        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}