class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix_sum = new int[nums.length];

        prefix_sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int lefts = i == 0 ? 0 : prefix_sum[i-1];
            int rights = i == nums.length - 1 ? 0 : prefix_sum[nums.length - 1] - prefix_sum[i];

            if (lefts == rights)
                return i;
        }

        return -1;
    }
}