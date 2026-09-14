class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();

        for (int num : nums1) {
            list1.add(num);
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                intersectionList.add(num);
                list1.remove(Integer.valueOf(num));
            }
        }

        return intersectionList.stream().mapToInt(Integer::intValue).toArray();
    }
}