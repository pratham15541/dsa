class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+"); // also trims extra spaces
        reverse(arr);
        return String.join(" ", arr);
    }

    private void reverse(String[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;  
            r--;   
        }
    }
}
