class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 2;
        int right = 2;

        while (right < nums.length) {
            if (nums[right] != nums[left-2]) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right] = temp;
            }
            right++;
        }

        return left;
    }
}