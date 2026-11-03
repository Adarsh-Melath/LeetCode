class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int writer = 0;
        int reader=0;

        while(reader<nums.length){
             if (nums[reader] % 2 == 0) {
                int temp = nums[writer];
                nums[writer++] = nums[reader];
                nums[reader] = temp;
            }

            reader++;
        }

        return nums;
    }
}