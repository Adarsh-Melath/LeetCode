class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for (int i = m; i < m + n; i++) {
        //     nums1[i] = nums2[i - m];
        // }

        // Arrays.sort(nums1);

        int writer = m + n - 1;
        int reader1 = m - 1;
        int reader2 = n - 1;

        while (reader1 >= 0 && reader2 >= 0) {
            if (nums1[reader1] < nums2[reader2]) {
                nums1[writer] = nums2[reader2--];
            } else {
                nums1[writer] = nums1[reader1--];
            }
            writer--;
        }

        while (reader1 >= 0) {
            nums1[writer--] = nums1[reader1--];
        }

        while (reader2 >= 0) {
            nums1[writer--] = nums2[reader2--];
        }
    }
}