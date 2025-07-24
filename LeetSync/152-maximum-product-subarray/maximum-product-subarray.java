class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            prefix = (prefix == 0 ? 1 : prefix) * nums[i];
            suffix = (suffix == 0 ? 1 : suffix) * nums[n - 1 - i];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }
}