import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            if (!seen.contains(ch)) {
                seen.add(ch);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
