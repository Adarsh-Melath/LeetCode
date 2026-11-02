class Solution {
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFit(nums, mid, k)) {
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return low;
    }

    public boolean canFit(int[] nums, int cap, int k) {
        int count = 1;
        int sum = 0;

        for (int num : nums) {
            if (sum + num > cap) {
                count++;
                sum = num;
            } else {
                sum += num;
            }
        }

        return count <= k;
    }
}