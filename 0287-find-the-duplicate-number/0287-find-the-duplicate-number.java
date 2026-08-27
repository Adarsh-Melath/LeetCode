class Solution {
    public int findDuplicate(int[] nums) {
        //brute : O(n) O(n)
        // HashSet<Integer> set=new HashSet<>();

        // for(int num:nums)
        // {
        //     if(!set.add(num))return num;
        // }

        // return 0;

        //optimal O(n) O(1)
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast)
                break;
        }

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}