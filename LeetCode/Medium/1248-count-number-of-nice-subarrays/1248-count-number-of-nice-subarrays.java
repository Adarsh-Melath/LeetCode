class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        //optimal solution
        //sum->freq
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int prefix = 0;
        int answer = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }

            prefix += num;
            int needed = prefix - k;

            answer += map.getOrDefault(needed, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return answer;

        //brute solution : O(n^2) O(1)
        // int count = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     int nOdds = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         if (nums[j] % 2 != 0) {
        //             nOdds++;
        //         }
        //         if (nOdds == k) {
        //             count++;
        //         }
        //     }
        // }

        // return count;
    }
}