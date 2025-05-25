class Solution {
    public int findGCD(int[] nums) {
        int minNumber = Integer.MAX_VALUE, maxNumber = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]< minNumber){
                minNumber = nums[i];
            }
            if(nums[i]>maxNumber){
            maxNumber = nums[i];
           }
        }

        int gcd = 1;
        for(int i=1;i<=minNumber;i++){
            if(minNumber%i==0 && maxNumber%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}