class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix_sum = new int[nums.length];
        int n = nums.length;
        prefix_sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = nums[i] + prefix_sum[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : prefix_sum[i-1];
            int right = i == n - 1 ? 0 : prefix_sum[n-1] - prefix_sum[i];

            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}