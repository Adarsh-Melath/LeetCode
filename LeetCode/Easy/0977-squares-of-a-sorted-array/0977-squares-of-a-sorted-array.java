class Solution {
    public int[] sortedSquares(int[] nums) {
        //brute
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }

        // Arrays.sort(nums);

        // return nums;

        //optimal
        int []result=new int[nums.length];

        int last=nums.length-1;
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                result[last]=nums[left]*nums[left];
                left++;
            }else{
                result[last]=nums[right]*nums[right];
                right--;
            }
            last--;
        }

        return result;
    }
}