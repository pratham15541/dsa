class Solution {
    public int countDigits(int num) {
        int res = 0;
        for (int n = num; n>0;n/=10){
            int digit =  n%10;
            if(digit !=0 && num %digit == 0){
                res++;
            }
        }
        return res;
    }
}