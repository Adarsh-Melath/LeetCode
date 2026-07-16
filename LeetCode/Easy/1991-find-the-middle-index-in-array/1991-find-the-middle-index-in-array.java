class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix_sum = new int[nums.length];
        prefix_sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix_sum[i] = nums[i] + prefix_sum[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            int left = i == 0 ? 0 : prefix_sum[i - 1];
            int right = i == nums.length - 1 ? 0 : prefix_sum[nums.length - 1] - prefix_sum[i];

            if (left == right)
                return i;
        }

        return -1;
    }
}