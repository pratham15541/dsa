class Solution {
    public String makeSmallestPalindrome(String s) {
         char[] arr = s.toCharArray();

        int l =0;
        int r = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(l<r){
           if (arr[l] != arr[r]) {
                if (arr[l] < arr[r]) {
                    arr[r] = arr[l];
                } else {
                    arr[l] = arr[r];
                }
            }
            l++;
            r--;
        }
        return new String(arr);
    }
}