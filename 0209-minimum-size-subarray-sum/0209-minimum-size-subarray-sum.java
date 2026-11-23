class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int left = 0;

        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                }
                currentSum -= nums[left++];
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}