class Solution {
    public int maxProfit(int[] prices) {
        int mProfit = 0;

        int left = 0;
        int right = 0;

        while (right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
            }
            mProfit = Math.max(mProfit, prices[right] - prices[left]);
            right++;
        }

        return mProfit;
    }
}