class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.computeIfPresent(num, (key, val) -> val > 1 ? val - 1 : null);
            }
        }

        int[] result = new int[list.size()];

        int index = 0;
        for (int num : list) {
            result[index++] = num;
        }

        return result;
    }
}