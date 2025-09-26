class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans,new StringBuilder(),0,0,n);
        return ans;
    }

    private void backtrack(List<String> res, StringBuilder sb, int open, int close, int n){
        if (sb.length() == n * 2) {
            res.add(sb.toString());
            return;
        }
         if (open < n) {
            sb.append('(');
            backtrack(res, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
         if (close < open) {
            sb.append(')');
            backtrack(res, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }

    }
}