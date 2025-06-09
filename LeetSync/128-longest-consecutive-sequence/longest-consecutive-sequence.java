class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Iterate through set
        for (int num : set) {
            // Only start counting when it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    }
}