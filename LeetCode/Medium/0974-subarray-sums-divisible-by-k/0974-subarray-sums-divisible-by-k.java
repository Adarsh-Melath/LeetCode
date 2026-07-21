class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;

            int remainder = ((prefix % k) + k)%k ;

            answer += map.getOrDefault(remainder, 0) ;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return answer;
    }
}