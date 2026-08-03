class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length == 1)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        int prefix = 0;
        int answer = 0;

        int index = 0;
        for (int num : nums) {
            prefix += num;

            int remainder = ((prefix % k) + k) % k;
            if (map.containsKey(remainder)) {
                int previousIndex = map.get(remainder);
                if (index - previousIndex >= 2)
                    return true;
            }else{
            map.put(remainder, index);

            }            index++;
        }
        return false;
    }
}