class Solution {
    public int findMin(int[] nums) {
        int breakingIndex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1])breakingIndex=i;
        }
        return nums[breakingIndex];
    }
}