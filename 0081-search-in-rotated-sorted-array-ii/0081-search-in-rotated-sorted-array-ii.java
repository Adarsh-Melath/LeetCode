class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid])
                return true;

            if (nums[mid] == nums[low]) {
                low++;
                continue;
            }
            
            if (nums[mid] <= nums[n - 1]) {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            } else {
                if (target >= nums[0] && target < nums[mid]) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            }
        }

        return false;
    }
}