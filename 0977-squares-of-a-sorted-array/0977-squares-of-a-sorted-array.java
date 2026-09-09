class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int writer=nums.length-1;

        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[writer]=nums[left]*nums[left];
                left++;
            }else{
                result[writer]=nums[right]*nums[right];
                right--;
            }

            writer--;
        }

        return result;
    }
}