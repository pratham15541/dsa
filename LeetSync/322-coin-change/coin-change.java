class Solution {
    public int coinChange(int[] coins, int amount) {
      Integer[] dp = new Integer[amount + 1];
        int res = helper(coins, amount, dp);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int helper(int[] coins, int amount, Integer[] dp) {
        if (amount == 0) return 0;       // no coins needed
        if (amount < 0) return Integer.MAX_VALUE; // invalid
        if (dp[amount] != null) return dp[amount];

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subRes = helper(coins, amount - coin, dp);
            if (subRes != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, 1 + subRes);
            }
        }

        dp[amount] = minCoins;
        return dp[amount];
    }
}