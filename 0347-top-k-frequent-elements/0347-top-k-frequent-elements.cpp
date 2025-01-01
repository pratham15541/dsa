class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        set<int> s;
       for(int x:nums){
        s.insert(x);
       }
       vector<int> ans;

    for(auto x:s){
        if(k==0){
            break;
        }
        ans.push_back(x);
        k--;
    }
    return ans;
    }
};