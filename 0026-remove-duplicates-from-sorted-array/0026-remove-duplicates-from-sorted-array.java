class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int right = 1;
        int val = nums[0];

        int k = 1;
        while (right < nums.length) {
            if (nums[right] != val) {
                int temp = nums[left];
                nums[left++] = nums[right];
                val=nums[right];
                nums[right] = temp;
                k++;
            }

            right++;
        }
        return k;
    }
}