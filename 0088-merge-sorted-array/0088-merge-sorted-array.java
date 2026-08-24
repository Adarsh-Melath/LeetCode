class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //brute force
        // for (int i = m; i < m + n; i++) {
        //     nums1[i] = nums2[i-m];
        // }//O(n)

        // Arrays.sort(nums1);//O(nlogn)

        int write = m + n - 1;
        int read1 = m - 1;
        int read2 = n - 1;

        while (read2 >=0  && read1 >=0) {
            if (nums2[read2] > nums1[read1]) {
                nums1[write] = nums2[read2--];
            } else {
                nums1[write] = nums1[read1--];
            }

            write--;
        }

        while (read2 >=0) {
            nums1[write--] = nums2[read2--];
        }

        while (read1 >= 0) {
            nums1[write] = nums1[read1];
            read1--;
            write--;
        }

        System.out.println("reader1: " + read1);
        System.out.println("reader2: " + read2);
    }
}