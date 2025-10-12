class Solution {
    public int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n:nums){
            mp.put(n, mp.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(mp.keySet());
        Collections.sort(list, (a,b) -> {
            if(mp.get(a).equals(mp.get(b))){
                return b-a;  //descending
            }
            return mp.get(a) - mp.get(b);
        });

        int k=0;
        for(Integer n : list){
            int count = mp.get(n);
            while(count>0){
                ans[k++] = n;
                count--;
            }
        }
        return ans;
    }
}