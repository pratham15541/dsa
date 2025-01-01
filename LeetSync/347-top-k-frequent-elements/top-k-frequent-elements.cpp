class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
         // Step 1: Count the frequency of each number
        unordered_map<int, int> freq;
        for (int num : nums) {
            freq[num]++;
        }

        // Step 2: Use a set to store elements by frequency
        // Use a pair where:
        // First element of the pair is frequency (to sort by it)
        // Second element is the number
        auto comp = [](const pair<int, int>& a, const pair<int, int>& b) {
            return a.first == b.first ? a.second < b.second : a.first > b.first; // Sort by frequency, then value
        };
        set<pair<int, int>, decltype(comp)> s(comp);

        for (auto& [num, count] : freq) {
            s.insert({count, num});
            if ((int)s.size() > k) {
                s.erase(prev(s.end())); // Remove the element with the lowest frequency
            }
        }

        // Step 3: Collect the top k frequent elements
        vector<int> ans;
        for (auto& [count, num] : s) {
            ans.push_back(num);
        }

        return ans;
    }
};