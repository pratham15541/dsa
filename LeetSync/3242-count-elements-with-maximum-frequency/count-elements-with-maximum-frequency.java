import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];  // Assuming input is in range [1, 100]
        int maxFreq = 0, result = 0;

        for (int num : nums) {
            freq[num]++;
            if (freq[num] > maxFreq) {
                maxFreq = freq[num];
                result = maxFreq;
            } else if (freq[num] == maxFreq) {
                result += maxFreq;
            }
        }

        return result;
    }
}
