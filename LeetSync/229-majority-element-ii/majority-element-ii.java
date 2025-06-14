class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        List<Integer> arr = new ArrayList<>();
        int thresHold = nums.length/3;

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int ele = e.getKey();
            int val = e.getValue();

            if(val > thresHold){
                arr.add(ele);
            }
        }
    return arr;
      
    }
}