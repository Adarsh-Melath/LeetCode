class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        if (sum >= (k * threshold))
            count++;

        int left = 0;
        int right = k;

        while (right < nums.length) {
            sum = sum - nums[left] + nums[right];

            if(sum>=(k*threshold))count++;
            right++;left++;
        }
return count;
    }
}