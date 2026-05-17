class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]res=new int[nums.length];
        int last=nums.length-1;

        int left=0;
        int right=nums.length-1;

        while(left<=right){
            if((nums[left]*nums[left]) > (nums[right]*nums[right])){
                res[last]=nums[left]*nums[left];
                left++;
            }else {
                res[last]=nums[right]*nums[right];
                right--;
            }
            last--;
        }

        return res;
    }
}