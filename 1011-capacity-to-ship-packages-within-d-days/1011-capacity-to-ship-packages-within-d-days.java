class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = 0;

        // O(n)
        for (int weight : weights) {
            low = Math.max(low, weight);
            high+=weight;
        }

        // O(log(high-low)*O(n))
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (count(weights, days, mid)) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return low;
    }

    private boolean count(int[] weights, int days, int weight) {
        int d = 1;

        int currentWeight = 0;

        for (int wght : weights) {
            if (currentWeight + wght > weight) {
                d++;
                currentWeight = 0;
            }

            if (d > days)
                return false;
            currentWeight += wght;
        }

        return d <= days ? true : false;
    }
}