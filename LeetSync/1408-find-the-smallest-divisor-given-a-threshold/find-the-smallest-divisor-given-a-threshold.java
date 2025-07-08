class Solution {
   public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = getMax(nums);
        int answer = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (computeSum(nums, mid) <= threshold) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return answer;
    }

    private int computeSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; 
        }
        return sum;
    }

    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
}