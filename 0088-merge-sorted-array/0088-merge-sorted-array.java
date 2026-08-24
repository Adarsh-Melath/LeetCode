class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //brute force
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i-m];
        }//O(n)

        Arrays.sort(nums1);//O(nlogn)
    }
}