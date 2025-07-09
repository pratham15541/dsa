class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = -1, totalWeight =0;
        for(int weight: weights){
            maxWeight = Math.max(maxWeight,weight);
            totalWeight += weight;
        }

        int l = maxWeight, h = totalWeight;
        while(l<=h){    
            int mid= l + (h-l)/2;
            if(isValid(weights,mid,days)){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }

    private boolean isValid(int[] weights, int capacity, int days){
        int currentLoad =0;
        int requireDays = 1;
        for(int weight:weights){
            if(currentLoad + weight >capacity){
                requireDays++;
                currentLoad =0;
            }
            currentLoad +=weight;
        }
        return requireDays <= days;
    }
}