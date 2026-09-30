class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1;
        int high = max;
        int answer = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalH = 0;
            int index = 0;
            while (index < piles.length) {
                totalH = totalH + (long) Math.ceil((double) piles[index++] / mid);
            }

            if (totalH <= h) {
                answer = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return answer;
    }
}