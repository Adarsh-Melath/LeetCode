class Solution {
    public boolean isHappy(int n) {

        int slow=n;
        int fast=n;

        while(fast!=1){
            slow=sq(slow);
            fast=sq(sq(fast));

            if(fast==1)return true;
            if(slow==fast)return false;
        }
        return true;
    }

    private int sq(int number) {
        int square = 0;

        while (number > 0) {
            int remainder = number % 10;
            square += remainder * remainder;
            number /= 10;
        }

        return  square;
    }
}