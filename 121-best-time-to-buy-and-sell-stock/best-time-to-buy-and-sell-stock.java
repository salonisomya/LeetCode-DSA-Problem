class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int l =0;
        int r =1;
        int maxprofit = 0;
        int minval = prices[0];

        for(int i=0;i<n;i++){
            minval = Math.min(minval,prices[i]);
            maxprofit = Math.max(maxprofit, prices[i] - minval);
        }

        

        return maxprofit;
    }
}