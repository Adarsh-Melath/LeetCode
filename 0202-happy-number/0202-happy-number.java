class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow=square(slow);
            fast=square(square(fast));

            if(fast==1)return true;
            if(slow==fast)
            {
                return false;
            }
        }

        return true;
    }

    private int square(int number) {
        int sq = 0;
        while (number > 0) {
            int remainder = number % 10;
            sq += remainder * remainder;
            number /= 10;
        }

        return sq;
    }
}