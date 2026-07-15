class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                prefix--;
            else
                prefix++;

            if (map.containsKey(prefix)) {
                maxLength =Math.max( i - map.get(prefix),maxLength);
            } else {
                map.put(prefix, i);
            }
        }
        return maxLength;
    }
}

//[0,1,1,0,1,1,1,0]