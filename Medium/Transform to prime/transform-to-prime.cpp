//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution
{
    public:
    
    bool isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i * i <= num; ++i) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
int nextPrime(int num) {
    while (true) {
        ++num;
        if (isPrime(num)) {
            return num;
        }
    }
}
int minNumber(int arr[], int N) {
    int sum = 0;
    for (int i = 0; i < N; i++) {
        sum += arr[i];
    }

    if (isPrime(sum)) {
        return 0;
    }

    int nextPrimeNum = nextPrime(sum);
    return abs(sum - nextPrimeNum);
}
};


//{ Driver Code Starts.

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
        Solution obj;
        cout << obj.minNumber(arr, n)<<endl;
    }
    return 0;
}
// } Driver Code Ends