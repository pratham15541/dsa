import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

    
        for (int num : nums) {
            freqMap.merge(num, 1, Integer::sum);
        }


        int maxFreq = Collections.max(freqMap.values());

        
        int result = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                result += freq;
            }
        }

        return result;
    }
}
