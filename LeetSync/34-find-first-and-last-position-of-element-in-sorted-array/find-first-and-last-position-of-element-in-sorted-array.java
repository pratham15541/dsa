class Solution {

    private int firstOccurence(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int res = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                res = mid;
                //Continue in left
                h = mid - 1;

            } else if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        return res;
    }

    private int lastOccurence(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int res = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                res = mid;
                //Continue in right
                l = mid + 1;

            } else if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        int res1 = firstOccurence(nums, target);
        int res2 = lastOccurence(nums, target);

        if (res1 != -1 && res2 != -1)
            return new int[] { res1, res2 };

        return new int[] { -1, -1 };
    }
}