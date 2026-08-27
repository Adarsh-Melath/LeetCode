class Solution {
    public int findDuplicate(int[] nums) {
        //brute : O(n) O(n)
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums)
        {
            if(!set.add(num))return num;
        }

        return 0;
    }
}