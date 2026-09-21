class Solution {
    public int maxArea(int[] nums) {
        //max area

        int maxA = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] < nums[right]) {
                maxA = Math.max(maxA, (right - left) * nums[left]);
                left++;
            } else {
                maxA = Math.max(maxA, (right - left) * nums[right]);
                right--;
            }
        }
        return maxA;
    }
}