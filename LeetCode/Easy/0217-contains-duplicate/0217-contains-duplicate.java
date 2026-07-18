class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>(n * 2);
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }
}