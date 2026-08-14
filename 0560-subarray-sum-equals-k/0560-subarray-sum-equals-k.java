class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int answer = 0;
        int prefix = 0;
        for (int num : nums) {
            prefix += num;
            int needed = prefix - k;

            answer += map.getOrDefault(needed, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return answer;
    }
}