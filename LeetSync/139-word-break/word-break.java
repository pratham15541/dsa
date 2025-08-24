class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
     Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];  // null = not visited

        return dfs(s, 0, wordSet, memo);
    }
 private boolean dfs(String s, int start, Set<String> wordSet, Boolean[] memo) {
        if (start == s.length()) return true; // reached end successfully
        if (memo[start] != null) return memo[start];

        for (String word : wordSet) {
            int len = word.length();
            if (start + len <= s.length() && s.startsWith(word, start)) {
                if (dfs(s, start + len, wordSet, memo)) {
                    return memo[start] = true;
                }
            }
        }

        return memo[start] = false; // no word worked
    }
}