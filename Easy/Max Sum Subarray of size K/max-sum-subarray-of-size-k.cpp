//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends


#define ll long long
class Solution{   
    public:
    long maximumSumSubarray(int K, vector<int> &Arr , int N){
        ll sum=0;
        for(int i=0;i<K;i++)
        sum+=Arr[i];
        
        int j=K;
        int i=0;
        ll maxi=sum;
        while(j<N)
        {
            sum+=Arr[j];
            sum-=Arr[i];
            i++;
            j++;
            
            if(sum>maxi)
            maxi=sum;
        }
        return maxi;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N,K;
        cin >> N >> K;;
        vector<int>Arr;
        for(int i=0;i<N;++i){
            int x;
            cin>>x;
            Arr.push_back(x);
        }
        Solution ob;
        cout << ob.maximumSumSubarray(K,Arr,N) << endl;
    }
    return 0; 
} 
// } Driver Code Ends