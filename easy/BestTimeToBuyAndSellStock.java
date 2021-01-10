// Problem URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int profit = 0, min =Integer.MAX_VALUE, max =0;
        for (int i = 0; i < prices.length; i++)
        {
            if(prices[i] < min){
                min = prices[i];
                max = 0;
            }
            if(prices[i] > max){
                max = prices[i];
            }
            profit = Math.max(profit, max-min);
        }
        return profit;
    }
}