class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            int remainder = ((prefix % k) + k) % k;

            if (map.containsKey(remainder)) {
                int prevI = map.get(remainder);
                if (i - prevI >= 2)
                    return true;
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}