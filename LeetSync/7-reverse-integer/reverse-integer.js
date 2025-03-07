/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let ans = 0;
    const INT_MAX = 2 ** 31 - 1; 
    const INT_MIN = -(2 ** 31);
    
    while (x !== 0) {
        let digit = x % 10;
        x = (x / 10) | 0;
      
        if (ans > Math.floor(INT_MAX / 10) || (ans === Math.floor(INT_MAX / 10) && digit > 7)) return 0;
        if (ans < Math.ceil(INT_MIN / 10) || (ans === Math.ceil(INT_MIN / 10) && digit < -8)) return 0;

        ans = ans * 10 + digit;
    }
    
    return ans;
};

