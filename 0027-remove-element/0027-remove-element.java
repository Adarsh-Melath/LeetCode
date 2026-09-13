class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != val) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right] = temp;
            }

            right++;
        }

        return left;
    }
}