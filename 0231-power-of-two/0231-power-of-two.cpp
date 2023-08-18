class Solution {
public:
    bool isPowerOfTwo(int n) {
    //     int i=0;
    //     bool t= true;
    //     if(n==0){
    //         return false;
    //     }
    //     while(i<n){
    //         if(n == pow(2,i)){
    //             t = true;
    //             break;

    //         }else{
    //             t= false;
    //         }
    //         i++;
    //     }
    // if(t==false){
    //     return false;
    // }else{
    //     return t;
    // }

     if (n <= 0) {
            return false;
        }
        
        return (n & (n - 1)) == 0;

    
     

    }
};