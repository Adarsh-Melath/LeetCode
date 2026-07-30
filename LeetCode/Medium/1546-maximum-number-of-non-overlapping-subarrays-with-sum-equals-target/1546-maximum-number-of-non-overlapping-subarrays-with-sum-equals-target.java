class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;

            int needed = prefix - target;
            if (map.containsKey(needed)) {
                answer++;
                map.clear();
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return answer;
    }
}