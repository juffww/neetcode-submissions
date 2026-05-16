class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int max = 0;

        for(int i = 1; i < prices.length; i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
            if(max < profit) max = profit;
        }

        return max;
    }
}
