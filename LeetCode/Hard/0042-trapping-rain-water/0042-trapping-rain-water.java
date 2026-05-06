class Solution {
    public int trap(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int leftMax=nums[left];
        int rightMax=nums[right];
        int sum=0;

        while(left<right){
            if(nums[left]<nums[right]){
                left++;
                leftMax=Math.max(nums[left],leftMax);
                sum+=leftMax-nums[left];
            }else{
                right--;
                rightMax=Math.max(nums[right],rightMax);
                sum+=rightMax-nums[right];
            }
        }

        return sum ;
    }
}