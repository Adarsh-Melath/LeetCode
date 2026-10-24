class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];

        int left=0;
        int right=n-1;
        int writer=n-1;

        while(left<=right){
            if(nums[left]*nums[left]> nums[right]*nums[right]){
                result[writer]=nums[left]*nums[left];
                left++;
            }else {
                result[writer]=nums[right]*nums[right];
                right--;
            }


            writer--;
        }

        return result;
    }
}