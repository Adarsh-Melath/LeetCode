class Solution {
    public int maxArea(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int maxArea=0;

        while(left<right){
            int min=Math.min(nums[left],nums[right]);
            int width=right-left;
            maxArea=Math.max(maxArea,width*min);

            if(nums[left]<nums[right]){
                left++;
            }else right--;
        }

        return maxArea;
    }
}