class Solution {
    public int findMin(int[] nums) {
        return solution(nums);
    }

    public static int solution(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums[left];

        while (left <= right) {
            if (nums[left] < nums[right]) {
                res = Math.min(nums[left], res);
                break;
            }

            int mid = (left + right) / 2;
            res = Math.min(res, nums[mid]);
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

}