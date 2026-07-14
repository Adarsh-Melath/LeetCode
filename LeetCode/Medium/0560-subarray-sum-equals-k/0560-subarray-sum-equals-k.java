class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;

            int need = prefix - k;

            answer += map.getOrDefault(need, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return answer;
    }
}