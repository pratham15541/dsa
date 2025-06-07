class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        for (int num : nums) {
            if (num > 0)
                positives.add(num);
            else
                negatives.add(num);
        }
        int pos = 0, neg = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = positives.get(pos++);
            } else {
                result[i] = negatives.get(neg++);
            }
        }

        return result;

    }
}