class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int l = 0, h = arr.length - 1;
        while (l < h) {
            String t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
            l++;
            h--;
        }
        return String.join(" ", arr);

    }
}