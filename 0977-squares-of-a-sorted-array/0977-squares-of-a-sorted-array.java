class Solution {
    public int[] sortedSquares(int[] nums) {
        //optimal
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int writer = nums.length - 1;

        while (left <= right) {
            int square1 = nums[left] * nums[left];

            int square2 = nums[right] * nums[right];

            if (square1 > square2) {
                result[writer] = square1;
                left++;
            } else {
                result[writer] = square2;
                right--;
            }

            writer--;
        }

        return result;
    }
}