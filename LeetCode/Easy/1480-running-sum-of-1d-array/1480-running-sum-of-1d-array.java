class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix_sum = new int[nums.length];
        prefix_sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix_sum[i] = nums[i] + prefix_sum[i - 1];
        }

        return prefix_sum;
    }
}