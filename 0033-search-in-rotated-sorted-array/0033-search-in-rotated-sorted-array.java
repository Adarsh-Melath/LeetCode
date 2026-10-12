class Solution {
    public int search(int[] nums, int target) {

        int pivot = 0;

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= nums[high]) {
                pivot = mid;
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int index1 = bs(nums, 0, pivot, target);
        int index2 = bs(nums, pivot + 1, nums.length - 1, target);

        return index1 != -1? index1 : index2;

        // O(n) O(1)
        // int index = -1;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //         index = i;
        //         break;
        //     }
        // }

        // return index;
    }

    private int bs(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

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
}