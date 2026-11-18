class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int l =0;
        int r =1;
        int maxprofit = 0;

        while(r<n){
            if(prices[l] <= prices[r]){
                int profit = prices[r] - prices[l];
                maxprofit = Math.max(maxprofit,profit);
                r++;
            }
            else{
                l=r;
                r++;
            }
        }

        return maxprofit;
    }
}