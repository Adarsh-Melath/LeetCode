class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];

            if (map.containsKey(num)) {
                int i = map.get(num);
                if ((j - i) <= k)
                    return true;
            }
            map.put(num, j);
        }

        return false;
    }
}