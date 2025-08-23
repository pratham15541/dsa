class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
      int n = triangle.size();
      
        Integer[][] memo = new Integer[n][n];
        return dfs(triangle, 0, 0, memo);
    }
    private int dfs(List<List<Integer>> triangle, int row, int col, Integer[][] memo) {
         int n = triangle.size();

        if (row == n - 1) {
            return triangle.get(row).get(col);
        }
         if (memo[row][col] != null) return memo[row][col];
          int down = dfs(triangle, row + 1, col, memo);
        int downRight = dfs(triangle, row + 1, col + 1, memo);
          memo[row][col] = triangle.get(row).get(col) + Math.min(down, downRight);
          
        return memo[row][col];
    }
}