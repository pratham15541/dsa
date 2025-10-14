class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        
        int n = nums.size();
        int inc = 1, prevInc = 0, res=0;
        for(int i=1;i<n;++i){
            if(nums.get(i) > nums.get(i-1)){
                inc++;
            }else{
                prevInc =inc;
                inc =1;
            }
            res = Math.max(res, Math.max(inc/2, Math.min(prevInc,inc)));
        }
        return res>=k;
    }
}