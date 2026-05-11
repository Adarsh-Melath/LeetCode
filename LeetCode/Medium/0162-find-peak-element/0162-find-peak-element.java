class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] > Integer.MIN_VALUE && nums[i] > nums[i + 1])
                    return 0;
            } else if (i == nums.length - 1) {
                if (nums[i] > nums[i - 1] && nums[i] > Integer.MIN_VALUE)
                    return i;
            } else {
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                    return i;
            }
        }

        return -1;
    }
}