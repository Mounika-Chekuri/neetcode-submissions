class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
       int n = prices.length;
       int maxprofit =0;
       for(int i=1;i<n;i++)
       {
          minPrice = Math.min(minPrice,prices[i]);
          maxprofit = Math.max(maxprofit,prices[i]-minPrice);

       } 
       return maxprofit;
    }
}
