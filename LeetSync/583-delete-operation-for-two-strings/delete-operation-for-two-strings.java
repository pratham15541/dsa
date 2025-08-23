class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        Integer[][] memo = new Integer[m][n]; // memo[i][j] stores result for indices i,j
        return helper(word1, word2, 0, 0, memo);
    }

    private int helper(String word1, String word2, int i, int j, Integer[][] memo) {
        // Base cases
        if (i == word1.length()) return word2.length() - j;
        if (j == word2.length()) return word1.length() - i;

        if (memo[i][j] != null) return memo[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            memo[i][j] = helper(word1, word2, i + 1, j + 1, memo); // no deletion
        } else {
            int deleteWord1 = 1 + helper(word1, word2, i + 1, j, memo);
            int deleteWord2 = 1 + helper(word1, word2, i, j + 1, memo);
            memo[i][j] = Math.min(deleteWord1, deleteWord2);
        }

        return memo[i][j];
    }
}
