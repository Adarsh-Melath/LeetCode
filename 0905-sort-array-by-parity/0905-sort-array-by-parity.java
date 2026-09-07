class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] % 2 == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}