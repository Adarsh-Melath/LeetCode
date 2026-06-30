class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = nums1[i];
            for (int j = 0; j < n; j++) {
                int b = nums2[j];
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            int c = nums3[i];
            for (int j = 0; j < n; j++) {
                int d = nums4[j];

                int lookupValue = -(c + d);

                if (map.containsKey(lookupValue))
                    answer += map.get(lookupValue);
            }
        }

        return answer;
    }
}