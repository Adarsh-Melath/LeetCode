class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        set.add(0);
        int prefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;

            int needed = prefix - target;

            if (set.contains(needed)) {
                answer++;
                set.clear();
            }

            set.add(prefix);
        }
        return answer;
    }
}