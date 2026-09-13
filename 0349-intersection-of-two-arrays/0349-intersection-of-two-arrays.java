class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        Set<Integer> intersection = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (i < nums1.length && j < nums2.length && nums1[i] > nums2[j]) {
                j++;
            } else {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }

        int index = 0;
        int[] result = new int[intersection.size()];

        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }
}