class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        int prefix = 0;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                prefix++;
            } else {
                prefix--;
            }

            if (map.containsKey(prefix)) {
                int previousIndex = map.get(prefix);
                answer = Math.max(i-previousIndex, answer);
            } else {
                map.put(prefix, i);
            }
        }
        return answer;
    }
}