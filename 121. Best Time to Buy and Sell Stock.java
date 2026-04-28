class Solution {
    public int maxProfit(int[] prices) {
      int min= prices[0];
      int mP = 0;

      for(int i=0; i < prices.length; i++){
        if(prices[i] <= min){
            min = prices[i];
        }
        int p = prices[i] - min;
        mP= Math.max(p,mP);
      }
      return mP;  
    }
}
