class Solution {
    int[] dp;
    public int rob(int[] nums) {
         dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return f(0, nums);
    }

    private int f(int i, int[] nums) {
        if (i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = Math.max(nums[i] + f(i + 2, nums), f(i + 1, nums));
    }
}
