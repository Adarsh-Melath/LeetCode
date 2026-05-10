class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
 
        int maxSum = sum;

        int start = 0;
        int end = k;

        while (end < nums.length) {
            sum = sum - nums[start] + nums[end];

            maxSum = Math.max(maxSum, sum);
            start++;
            end++;
        }
        return (double) maxSum / k;
    }
}