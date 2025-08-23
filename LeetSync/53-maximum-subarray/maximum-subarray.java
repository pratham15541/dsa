class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        Integer[] dp = new Integer[n]; // memoization for maxEndingHere
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, maxEndingHere(nums, i, dp));
        }
        return max;
    }

    private int maxEndingHere(int[] nums, int i, Integer[] dp) {
        if (i == 0) return nums[0];
        if (dp[i] != null) return dp[i];

        dp[i] = Math.max(nums[i], nums[i] + maxEndingHere(nums, i - 1, dp));
        return dp[i];
    }
}
