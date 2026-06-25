class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int length = 1;

            while (set.contains(currentNumber + 1)) {
                length++;
                currentNumber++;
                i++;
            }

            longest = Math.max(length, longest);
        }

        return longest;
    }
}