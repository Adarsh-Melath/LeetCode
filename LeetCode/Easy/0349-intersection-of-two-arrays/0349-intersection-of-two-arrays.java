class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashSet<Integer> set1 = new HashSet<>(2*n);

        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>(2*n);
        for (int num : nums2) {
            if (set1.contains(num))
                intersection.add(num);
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }
}