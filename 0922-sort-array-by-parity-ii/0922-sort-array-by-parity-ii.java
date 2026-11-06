class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length && j < nums.length) {
            if (i % 2 == 0 && nums[i] % 2 == 0) {
                i += 2;
            } else if (j % 2 != 0 && nums[j] % 2 != 0) {
                j += 2;
            } else {
                swap(nums, i, j);
                i += 2;
                j += 2;
            }
        }

        return nums;
    }

    public void swap(int nums[], int writer, int reader) {
        int temp = nums[reader];
        nums[reader] = nums[writer];
        nums[writer] = temp;
    }
}