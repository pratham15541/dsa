class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ans = 0;
        int temp = x;
        while(x!=0){
            int lastDigit = x%10;
            ans = ans*10 + lastDigit;
            x/=10;
        }
       
        return ans==temp;
    }
}