class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int previousMax = 0;
        int rightM[] = new int[n];
        int profit = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (prices[i] > previousMax) {
                previousMax = prices[i];
            }
            rightM[i] = previousMax;
        }

        for (int i = 0; i < n; i++) {
            if (rightM[i] - prices[i] > profit)
                profit = rightM[i] - prices[i];
        }
        return profit;
    }
}