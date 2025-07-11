class Solution {

    public int splitArray(int[] nums, int k) {
        int l = 0, h = 0, n = nums.length;
        for (int num : nums) {
            h += num;
            l = Math.max(l, num);
        }
        int res = h;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isValid(nums, k, mid)) {
                h = mid - 1;
                res = Math.min(res, mid);
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    private boolean isValid(int[] nums, int k, int mid){
        int split = 1, sum=0;
        for(int num:nums){
            if(sum+num <=mid){
                sum+=num;
            }else{
                sum = num;
                split++;           
                }
        }
        return split<=k;
    }
}