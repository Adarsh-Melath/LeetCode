class Solution {
    public int findMiddleIndex(int[] nums) {
        int []prefix=new int[nums.length];

        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }

        for(int i=0;i<nums.length;i++){
            int left=i==0?0:prefix[i-1];
            int right=i==nums.length-1?0:prefix[nums.length-1]-prefix[i];

            if(right==left)return i;
        }
        return -1;
    }
}