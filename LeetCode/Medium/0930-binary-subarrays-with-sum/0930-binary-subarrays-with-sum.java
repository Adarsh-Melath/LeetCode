class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;

            int needed = prefix - goal;
            answer += map.getOrDefault(needed, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return answer;
    }
}