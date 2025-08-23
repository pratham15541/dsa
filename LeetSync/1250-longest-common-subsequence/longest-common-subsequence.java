class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] dp = new Integer[text1.length()][text2.length()];
        return lcs(text1,text2,0,0,dp);
    }

    private int lcs(String s1, String s2, int i, int j , Integer[][] dp){
        if(i>= s1.length() || j >= s2.length()) return 0;
        if(dp[i][j] != null) return dp[i][j];
        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + lcs(s1, s2, i + 1, j + 1, dp);
        } else {
            dp[i][j] = Math.max(lcs(s1, s2, i + 1, j, dp), lcs(s1, s2, i, j + 1, dp));
        }

        return dp[i][j];
    }
}