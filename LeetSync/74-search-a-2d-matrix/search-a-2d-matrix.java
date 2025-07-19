class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // binary search

        int n = matrix.length;
        int m = matrix[0].length;

        int l =0, r= m*n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            int mid_val = matrix[mid/m][mid%m];
            if(mid_val == target){
                return true;
            }else if( mid_val < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return false;
    }
}