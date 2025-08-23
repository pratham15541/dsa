class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        Integer[][] dp = new Integer[n][n];
        

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, minSum(matrix, 0, j, dp));
        }
        return ans;
    }

    private int minSum(int[][] matrix, int i, int j, Integer[][] dp) {
        int n = matrix.length;

        // Out of bounds
        if (j < 0 || j >= n) return (int)1e9; 

        // Last row
        if (i == n - 1) return matrix[i][j];

        if (dp[i][j] != null) return dp[i][j];

        int down = minSum(matrix, i + 1, j, dp);
        int leftDiag = minSum(matrix, i + 1, j - 1, dp);
        int rightDiag = minSum(matrix, i + 1, j + 1, dp);

        dp[i][j] = matrix[i][j] + Math.min(down, Math.min(leftDiag, rightDiag));
        return dp[i][j];
    }
}
