class Solution {
    public boolean isPalindrome(String s) {
        String validString = s.replaceAll("[^a-zA-Z0-9\\s]","").replaceAll("\\s","").toLowerCase();
        int left = 0,right = validString.length()-1;
        System.out.println(validString);
        while(left<right){
            if(validString.charAt(left) != validString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}