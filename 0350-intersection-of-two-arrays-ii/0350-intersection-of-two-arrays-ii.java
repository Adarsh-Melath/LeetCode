class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> numbers1 = new ArrayList<>();

        for (int num : nums1) {
            numbers1.add(num);
        }

        List<Integer> intersections = new ArrayList<>();
        for (int num:nums2) {
            if (numbers1.contains(num)) {
                intersections.add(num);
                numbers1.remove(Integer.valueOf(num));
            }
        }

        int[] result = new int[intersections.size()];

        int index = 0;
        for (int num : intersections) {
            result[index++] = num;
        }

        return result;
    }
}