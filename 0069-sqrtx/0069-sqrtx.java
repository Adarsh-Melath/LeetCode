class Solution {
    public int mySqrt(int x) {
        if (x == 1 || x == 0) {
            return x;
        }
        
        long ans = 0;
        long low = 0;
        long high = x / 2;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if(mid*mid==x)return (int)mid;
            if (mid * mid <x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) high;
    }
}