class Solution {
    public int maxArea(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int maxArea=0;

        while(left<right){
            int min=Math.min(nums[left],nums[right]);
            int width=right-left;
            maxArea=Math.max(maxArea,width*min);

            while(left<right && nums[left]<=min)left++;
            while(left<right && nums[right]<=min)right--;
        }

        return maxArea;
    }
}