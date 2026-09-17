class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // m=nums1.length
        // n=nums2.length

        //O(M)
        Set<Integer> numberSet1 = new HashSet<>();

        // O(M)
        for (int num : nums1) {
            numberSet1.add(num);
        }

        //O(N)
        Set<Integer> intersection = new HashSet<>();

        //O(N)
        for (int num : nums2) {
            if (numberSet1.contains(num)) {
                intersection.add(num);
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