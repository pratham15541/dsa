class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,max = 0;
        if(nums == null || nums.length<1) return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==1){
                count++;
                max = max>count?max:count;
            }else{
                count = 0;
            }
        }
        return max;
    }
}