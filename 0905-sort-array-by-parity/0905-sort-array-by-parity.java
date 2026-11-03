class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int writer = 0;

        for (int reader = 0; reader < nums.length; reader++) {
            if (nums[reader] % 2 == 0) {
                int temp = nums[writer];
                nums[writer++] = nums[reader];
                nums[reader] = temp;

            }
        }

        return nums;
    }
}