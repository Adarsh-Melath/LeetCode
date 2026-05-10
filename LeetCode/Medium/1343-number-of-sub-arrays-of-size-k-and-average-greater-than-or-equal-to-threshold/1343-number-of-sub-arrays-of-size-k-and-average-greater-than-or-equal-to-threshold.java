class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int condition = k * threshold;
        if (sum >= (condition)) {
            count++;
        }

        int left = 0;
        int right = k;

        while (right < nums.length) {
            sum = sum - nums[left] + nums[right];

            if (sum >= condition) {
                count++;
            }

            left++;
            right++;
        }
        return  count;
    }
}