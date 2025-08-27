class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];

            for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j))
                    dp[i][j] = 1 + dp[i+1][j+1];
                else
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }

        StringBuilder sb= new StringBuilder();
         int i = 0, j = 0;
        while (i < n && j < m) {
            if (text1.charAt(i) == text2.charAt(j)) {
                sb.append(text1.charAt(i));
                i++; j++;
            } else if (dp[i+1][j] >= dp[i][j+1]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("LCS Length: " + dp[0][0]);
        System.out.println("LCS String: " + sb.toString());
        return dp[0][0];
    }
}