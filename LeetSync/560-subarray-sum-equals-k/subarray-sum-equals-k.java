class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt =0 , n = nums.length;
     for (int i = 0 ; i < n; i++) { 
            int sum = 0;
            for (int j = i; j < n; j++) { 
         
                
                sum += nums[j];

                
                if (sum == k)
                    cnt++;
            }
        }
      return cnt;
    }
}