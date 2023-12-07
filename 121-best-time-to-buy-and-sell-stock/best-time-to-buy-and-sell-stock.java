class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(prices[i],min);
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}