class Solution {
    public int searchInsert(int[] nums, int target) {
        //optimal O(logN) O(1)

        int left = 0;
        int right = nums.length - 1;
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
                result=left;
            }
        }

        return result;
    }
}