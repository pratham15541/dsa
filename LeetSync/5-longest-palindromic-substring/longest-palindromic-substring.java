class Solution {
    private String s;
    private Boolean[][] dp;
    private int start = 0, maxLen = 1;

    public String longestPalindrome(String s) {
        this.s = s;
        int n = s.length();
        dp = new Boolean[n][n];

        // Check all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(i, j)) {
                    if (j - i + 1 > maxLen) {
                        start = i;
                        maxLen = j - i + 1;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    private boolean isPalindrome(int i, int j) {
        if (i >= j) return true;
        if (dp[i][j] != null) return dp[i][j];
        if (s.charAt(i) != s.charAt(j)) {
            return dp[i][j] = false;
        }
        return dp[i][j] = isPalindrome(i + 1, j - 1);
    }
}
