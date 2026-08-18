class Solution {
    public int maxProfit(int[] prices) {
       int minpr = prices[0];
       int maxp = 0;

       for(int i = 1; i<prices.length; i++){
        int profit = prices[i] - minpr;
        maxp = Math.max(maxp,profit);
        minpr = Math.min(minpr,prices[i]);
       }
       return maxp;
        
    }
}
