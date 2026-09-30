class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEatInTime(piles, mid, h)) {
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return low;
    }

    public boolean canEatInTime(int piles[], int k, int h) {
        long totalH = 0;
        for (int pile : piles) {
            int div = pile / k;
            totalH +=div;
            if(pile%k!=0)totalH++;
        }

        return totalH <= h;
    }
}