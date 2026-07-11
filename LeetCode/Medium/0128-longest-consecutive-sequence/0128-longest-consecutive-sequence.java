class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        int answer = 0;
        for (int n:set) {
            if (!set.contains(n - 1)) {
                int num = n;
                int count = 1;

                while (set.contains(num + 1)) {
                    count++;
                    num++;
                }

                answer = Math.max(answer, count);
            }
        }

        return answer;
    }
}