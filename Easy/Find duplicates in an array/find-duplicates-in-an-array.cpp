//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
  public:
    vector<int> duplicates(int arr[], int n) {
        // code here
         int hash[n]={0};
        vector<int> ans;
        // code here
        for(int i=0; i<n; i++)
        {
            if(hash[arr[i]]==1)
            ans.push_back(arr[i]);
            
            hash[arr[i]]++;
        }
        if(ans.empty())
        ans.push_back(-1);
        
        sort(ans.begin(),ans.end());
        return ans;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) cin >> a[i];
        Solution obj;
        vector<int> ans = obj.duplicates(a, n);
        for (int i : ans) cout << i << ' ';
        cout << endl;
    }
    return 0;
}

// } Driver Code Ends