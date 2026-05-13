import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();

        int nums1P = 0;
        int nums2P = 0;

        while (nums1P < nums1.length && nums2P < nums2.length) {

            if (nums1[nums1P] == nums2[nums2P]) {
                set.add(nums1[nums1P]);
                nums1P++;
                nums2P++;

            } else if (nums1[nums1P] < nums2[nums2P]) {
                nums1P++;

            } else {
                nums2P++;
            }
        }

        int[] arr = new int[set.size()];
        int index = 0;

        for (int num : set) {
            arr[index] = num;
            index++;
        }

        return arr;
    }
}