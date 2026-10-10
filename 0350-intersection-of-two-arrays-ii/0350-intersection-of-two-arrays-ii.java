class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); //O(m)

        for (int num : nums1) { // O(m)
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>(); //O(n)

        for (int num : nums2) {//O(n)
            if (map.containsKey(num)) {
                intersection.add(num);
                map.computeIfPresent(num, (key, val) -> val > 1 ? val - 1 : null);
            }
        }

        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}