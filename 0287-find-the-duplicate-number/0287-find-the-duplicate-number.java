class Solution {
    public int findDuplicate(int[] nums) {
        //brute : which actually use a o(n) spacce

        HashSet<Integer> set=new HashSet<>();

        for(int num:nums)
        {
            if(!set.add(num))
            {
                return num;
            }
        }
        return -1;
    }
}