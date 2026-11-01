class Solution {
    public boolean isHappy(int n) {
      int slow=n;
      int fast=n;

      while(fast!=1){
        slow=sqsum(slow);
        fast=sqsum(sqsum(fast));

        if(fast==1)return true;
        if(slow==fast)return false;
      } 
      return true;
    }

    public int sqsum(int n) {
        int sum = 0;

        while (n !=0) {
            int remainder = n % 10;
            sum += Math.pow(remainder, 2);
            n /= 10;
        }

        return sum;
    }
}