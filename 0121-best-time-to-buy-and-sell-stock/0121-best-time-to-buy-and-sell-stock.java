class Solution {
    public int maxProfit(int[] prices) {
        int mProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                mProfit = Math.max(mProfit,prices[right] - prices[left]);
            } else {
                left=right;
            }
            right++;
        }
        return mProfit;
    }
}