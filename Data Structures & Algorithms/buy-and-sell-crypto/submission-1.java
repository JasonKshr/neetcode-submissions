class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int max = 0;

        while(right < prices.length){

            int sell = prices[right] - prices[left];

            if (prices[right] > prices[left]){ 
                max = Math.max(sell, max);
            }
            else{
                left = right;
            }
            right++;

        }
        return max;
        
    }
}
