class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;

        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                int profit = prices[j] - prices[i];
                if(profit > max) max = profit;
            }
        }

        return max;
    }
}
