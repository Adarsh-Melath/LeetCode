class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startingIndex = lowerBound(nums, target);
        if(startingIndex==nums.length || nums[startingIndex]!=target)return new int []{-1,-1};
        int endingIndex = upperBound(nums, target);


        return new int[] { startingIndex, endingIndex };
    }

    public int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int answer =nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                answer = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }

        return answer;
    }

    public int upperBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int answer = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                answer = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return answer-1;
    }
}