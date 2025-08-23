class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);  // initialize dp
        return countPaths(0, 0, obstacleGrid, dp);
    }

    private int countPaths(int i, int j, int[][] grid, int[][] dp) {
        int m = grid.length, n = grid[0].length;

        if (i >= m || j >= n || grid[i][j] == 1) return 0;

        if (i == m - 1 && j == n - 1) return 1;

        if (dp[i][j] != -1) return dp[i][j];

        dp[i][j] = countPaths(i + 1, j, grid, dp) + countPaths(i, j + 1, grid, dp);
        return dp[i][j];
    }
}