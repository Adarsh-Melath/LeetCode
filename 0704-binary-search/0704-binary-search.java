class Solution {
    public int search(int[] nums, int target) {
        // brute O(N) O(1)
        // return bruteSol(nums, target);

        // optimal O(logN) O(1)
        return optimalSol(nums, target);
    }

    public int optimalSol(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int bruteSol(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }

        return -1;
    }
}