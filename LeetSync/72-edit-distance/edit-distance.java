class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        Integer[][] dp = new Integer[m + 1][n + 1];
        return helper(word1, word2, 0, 0, dp);
    }

    private int helper(String word1, String word2, int i, int j, Integer[][] dp) {
        if (i == word1.length()) return word2.length() - j; // insert remaining
        if (j == word2.length()) return word1.length() - i; // delete remaining

        if (dp[i][j] != null) return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = helper(word1, word2, i + 1, j + 1, dp);
        } else {
            int insert = 1 + helper(word1, word2, i, j + 1, dp);    
            int delete = 1 + helper(word1, word2, i + 1, j, dp);    
            int replace = 1 + helper(word1, word2, i + 1, j + 1, dp);
            dp[i][j] = Math.min(insert, Math.min(delete, replace));
        }

        return dp[i][j];
    }
}
