class Solution {
    public int trap(int[] height) {
        //brute force
        int n = height.length;
        int  l =0, r= n-1;
        int res =0;
        int maxLeft =0, maxRight =0;
        while(l<=r){
            if(height[l] <= height[r]){
                if(height[l] >= maxLeft){
                    maxLeft = height[l];
                }else{
                    res+= maxLeft - height[l];
                }
                l++;
            }else{
                if(height[r] >= maxRight){
                    maxRight = height[r];
                }else{
                    res+= maxRight - height[r];
                }
                r--;
            }
        }
        return res;
    }
}