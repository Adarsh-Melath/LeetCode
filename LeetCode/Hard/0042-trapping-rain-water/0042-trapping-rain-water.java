class Solution {
    public int trap(int[] nums) {
        int sum = 0;
        int left = 0;
        int right = nums.length - 1;
        int maxLeft = nums[left];
        int maxRight = nums[right];

        while (left < right) {
            if (nums[left] < nums[right]) {
                left++;
                maxLeft = Math.max(maxLeft, nums[left]);
                sum += maxLeft - nums[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, nums[right]);
                sum += maxRight - nums[right];
            }
        }
        return sum;
    }
}