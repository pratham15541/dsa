class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > max) {
                    ans = sub;
                    max = sub.length();
                }
            }
        }
        
        return ans;
    }

    boolean isPalindrome(String s) {
        int l = 0, h = s.length() - 1;
        while (l <= h) {
            if (s.charAt(l) != s.charAt(h)) {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}
