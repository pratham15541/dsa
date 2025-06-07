class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length == 0)
            return -1;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            maxProfit = Math.max(maxProfit,prices[i] - minPrice);
             minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}