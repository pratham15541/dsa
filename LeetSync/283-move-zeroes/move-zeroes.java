class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){
                arr.add(nums[i]);
            }
        }

        int size = arr.size();
        for(int i=0;i<n;i++){
            if(i<size){
                nums[i] = arr.get(i);
            }else {
                nums[i] = 0;
            }
        }
       
    }
}