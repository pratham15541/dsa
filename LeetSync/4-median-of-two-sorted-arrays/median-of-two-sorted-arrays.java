class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }

        }
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        while (j < n) {
            arr[k++] = nums2[j++];
        }
        double ans = 0;
        if ((arr.length % 2) == 0) {
            int mid = (arr.length - 1) / 2;
            double median = (arr[mid] + arr[mid + 1]) / 2.0;
            ans = median;
        } else {
            int mid = (arr.length - 1) / 2;
            double median = arr[mid];

            ans = median;
        }
        return ans;
    }
}