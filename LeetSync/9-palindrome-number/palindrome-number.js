/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0) return false;
    let ans = 0;
    let n = x;
    while(n>0){
        ans = ans*10 + n%10;
        n = Math.floor(n/=10)
    }
    return x==ans
};