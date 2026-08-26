class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int right = 1;

        while (right < nums.length) {
            if (nums[right] != nums[left - 1]) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right] = temp;
            }
            right++;
        }

        return left;
    }
}