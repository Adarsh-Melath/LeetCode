class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        int start = 0;
        int end = k;

        while (end < nums.length) {
            sum = sum + nums[end] - nums[start];

            max = Math.max(sum, max);
            end++;
            start++;
        }

        return (double)max/k;
    }
}