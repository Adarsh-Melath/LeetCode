class Solution {
    public int trap(int[] nums) {
        //optimal 2: 
        int sum = 0;
        int[] maxLeft = new int[nums.length];
        int[] maxRight=new int [nums.length];

        int maxL=0;
        int maxR=0;

        for(int i=0;i<nums.length;i++){
            maxLeft[i]=maxL;
            maxL=Math.max(maxL,nums[i]);
        }

        for(int i=nums.length-1;i>=0;i--){
            maxRight[i]=maxR;
            maxR=Math.max(maxR,nums[i]);
        }


for(int i=0;i<nums.length;i++){
  int waterLevel=Math.min(maxLeft[i],maxRight[i]);

  if(waterLevel>nums[i]){
    sum+=waterLevel-nums[i];
  }
}
        return sum;
        //optimal 1: 
        // int sum = 0;
        // int left = 0;
        // int right = nums.length - 1;
        // int maxLeft = nums[left];
        // int maxRight = nums[right];

        // while (left < right) {
        //     if (nums[left] < nums[right]) {
        //         left++;
        //         maxLeft = Math.max(maxLeft, nums[left]);
        //         sum += maxLeft - nums[left];
        //     } else {
        //         right--;
        //         maxRight = Math.max(maxRight, nums[right]);
        //         sum += maxRight - nums[right];
        //     }
        // }
        // return sum;
    }
}