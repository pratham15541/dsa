class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
// If total sum is odd, cannot partition into 2 equal subsets
        if (total % 2 != 0) return false;

        int target = total / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];
        return helper(nums, 0, target, dp);

    }

    private boolean helper(int[] nums, int i, int target, Boolean[][] dp) {
        if (target == 0) return true;              // found subset
        if (i >= nums.length || target < 0) return false;

        if (dp[i][target] != null) return dp[i][target];

        // choose current number or skip
        boolean take = helper(nums, i + 1, target - nums[i], dp);
        boolean skip = helper(nums, i + 1, target, dp);

        return dp[i][target] = take || skip;
    }
}