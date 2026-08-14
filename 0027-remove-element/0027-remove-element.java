class Solution {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = 0;
        int n = nums.length;
        int result = 0;

        while (right < n) {
            if (nums[right] != val) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right] = temp;
                result++;
            }

            right++;
        }
        return result;
    }
}