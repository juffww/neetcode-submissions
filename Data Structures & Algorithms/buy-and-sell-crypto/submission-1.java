class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int max = 0;
        int n = prices.length;

        for(int i = 1; i < n; i++)
        {
            int value = prices[i];

            int profit = value - minPrice;

            if(max < profit) max = profit;
            if(value < minPrice) minPrice = value;
        }
        return (max<0) ? 0 : max;
    }
}
