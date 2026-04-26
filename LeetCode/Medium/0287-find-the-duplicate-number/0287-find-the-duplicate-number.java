class Solution {
   public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

        //second approach
        /*Arrays.sort(nums);
        
        int left = 0;
        int right = left + 1;
        
        while (right < nums.length) {
            if (nums[left] == nums[right])
                return nums[right];
            left++;
            right++;
        }
        return -1;*/

        // first approach
        /* Set map = new HashSet<>();
        
        for (int num : nums) {
            if (map.contains(num)) {
                return num;
            }
            map.add(num);
        }
        return -1;*/
    }
}