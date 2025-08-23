class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) dp[i] = new HashMap<>();

        return dfs(nums, 0, 0, target, dp);
    }

    private int dfs(int[] nums, int i, int sum, int target, Map<Integer, Integer>[] dp) {
        int n = nums.length;

        if (i == n) {
            return sum == target ? 1 : 0;
        }

        if (dp[i].containsKey(sum)) {
            return dp[i].get(sum);
        }

        int add = dfs(nums, i + 1, sum + nums[i], target, dp);
        int subtract = dfs(nums, i + 1, sum - nums[i], target, dp);

        dp[i].put(sum, add + subtract); // store in map
        return add + subtract;
    }
}
