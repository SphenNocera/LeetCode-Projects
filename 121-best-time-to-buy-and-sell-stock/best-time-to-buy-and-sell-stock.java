class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0, r = l + 1;

        while(r < prices.length){
            if(prices[r] < prices[l]){
                l = r;
                // if(r < prices.length-1)
                //     r = l + 1;
            }
            if(prices[r] - prices[l] > maxProfit){
                maxProfit = prices[r] - prices[l];
            }
            r++;
        }

        return maxProfit;
    }
}