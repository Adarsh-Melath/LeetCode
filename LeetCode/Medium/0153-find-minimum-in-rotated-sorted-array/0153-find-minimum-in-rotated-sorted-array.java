class Solution {
    public int findMin(int[] nums) {
        return solution(nums);
    }

   public static int solution(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        int min1 = binarysearch(0, mid, nums);
        int min2 = binarysearch(mid + 1, high, nums);
        return Math.min(min1, min2);
    }

    public static int binarysearch(int low, int high, int[] nums) {
        int minimum = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[mid + 1]) {
                minimum = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return minimum;
    }
}