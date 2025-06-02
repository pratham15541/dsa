class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length < 1){
            return 0;
        }

        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}