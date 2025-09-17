class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.clear(); 
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                mp.put(c, mp.getOrDefault(c, 0) + 1);

                int maxFreq = Collections.max(mp.values());
                int minFreq = Collections.min(mp.values());

                sum += (maxFreq - minFreq);
            }
        }
        return sum;
    }
}