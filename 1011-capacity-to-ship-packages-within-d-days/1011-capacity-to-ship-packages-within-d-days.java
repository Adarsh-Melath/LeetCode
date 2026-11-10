class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(weights, mid, days)) {
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return low;
    }

    public boolean check(int[] weights, int maxWeight, int days) {
        int day = 1;
        int total = 0;

        for (int weight : weights) {
            if (total + weight > maxWeight) {
                day++;
                total = weight;
            }else{
                total+=weight;
            }
        }

        return day <= days ? true : false;
    }
}