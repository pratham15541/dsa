class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int current = mat[i][j];

                int up = (i > 0) ? mat[i - 1][j] : Integer.MIN_VALUE;
                int down = (i < m - 1) ? mat[i + 1][j] : Integer.MIN_VALUE;
                int left = (j > 0) ? mat[i][j - 1] : Integer.MIN_VALUE;
                int right = (j < n - 1) ? mat[i][j + 1] : Integer.MIN_VALUE;

                if (current > up && current > down && current > left && current > right) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}