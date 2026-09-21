class Solution {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        if (x == 0)
            return 0;
        long ans = 0;
        long low = 0;
        long  high = x / 2;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}