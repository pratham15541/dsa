class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
            int dp[][] = new int[m][n];
            for(int row[] :dp){
                Arrays.fill(row,-1);
            }
        return helper(0,0,m,n,dp,grid);
    }
    private int helper(int i, int j , int m, int n, int[][] dp,int[][] grid){
        if(i >= m || j>=n) return Integer.MAX_VALUE;
       if(i == m-1 && j == n-1) return grid[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = grid[i][j] + Math.min(helper(i+1, j, m, n, dp,grid), helper(i, j+1, m, n, dp,grid));
    }
}