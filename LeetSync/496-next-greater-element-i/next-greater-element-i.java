class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int nextGreater = -1; 

 
            int targetIndexInNums2 = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    targetIndexInNums2 = j;
                    break;
                }
            }

            
            if (targetIndexInNums2 != -1) {
                for (int k = targetIndexInNums2 + 1; k < nums2.length; k++) {
                    if (nums2[k] > target) {
                        nextGreater = nums2[k];
                        break; 
                    }
                }
            }
            ans[i] = nextGreater;
        }
        return ans;
    }
}