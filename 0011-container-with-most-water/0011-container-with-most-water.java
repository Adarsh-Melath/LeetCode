class Solution {
    public int maxArea(int[] nums) {
        int left=0;
        int right=nums.length-1;

        int maxA=0;
        while(left<right){
            int base=right-left;
            if(nums[left]<nums[right]){
                maxA=Math.max(maxA,base*nums[left]);
                left++;
            }else{
                maxA=Math.max(maxA,base*nums[right]);
                right--;
            }
        }

        return maxA;
    }
}