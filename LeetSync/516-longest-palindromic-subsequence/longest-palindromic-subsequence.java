class Solution {
    public int longestPalindromeSubseq(String s) {
           int n = s.length();
        Integer[][] dp = new Integer[n][n];
        return helper(s, 0, n - 1, dp);
    }
      private int helper(String s, int i, int j, Integer[][] memo) {
        if (i > j) return 0;        // empty substring
        if (i == j) return 1;       // single char palindrome

        if (memo[i][j] != null) return memo[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            memo[i][j] = 2 + helper(s, i + 1, j - 1, memo);
        } else {
            memo[i][j] = Math.max(helper(s, i + 1, j, memo), helper(s, i, j - 1, memo));
        }

        return memo[i][j];
    }
}