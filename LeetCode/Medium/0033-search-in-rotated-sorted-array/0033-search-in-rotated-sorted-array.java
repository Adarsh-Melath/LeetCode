class Solution {
    public int search(int[] nums, int target) {
        int mid = (nums.length / 2);
        if (nums[0] > target) {
            return binarySearch(nums, mid+1, nums.length-1, target);
        } else if (nums[0] < nums[nums.length-1])
            return binarySearch(nums, 0, nums.length-1, target);
        else if(nums[nums.length-1]<2){
            return binarySearch(nums,0,mid,target);
        }
        return -1;
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else
                left = mid + 1;
        }

        return -1;
    }
}