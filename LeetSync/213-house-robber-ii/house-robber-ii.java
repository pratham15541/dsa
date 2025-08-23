import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        // Case 1: rob from 0 to n-2
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = robFrom(0, 0, n - 2, nums, dp1);

        // Case 2: rob from 1 to n-1
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = robFrom(1, 1, n - 1, nums, dp2);

        return Math.max(case1, case2);
    }

    private int robFrom(int i, int start, int end, int[] nums, int[] dp) {
        if (i > end) return 0;
        if (dp[i] != -1) return dp[i];

        int rob = nums[i] + robFrom(i + 2, start, end, nums, dp);
        int skip = robFrom(i + 1, start, end, nums, dp);

        return dp[i] = Math.max(rob, skip);
    }
}
