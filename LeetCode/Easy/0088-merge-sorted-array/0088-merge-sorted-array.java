class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //brute force solution 
        int index=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[index++];
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}