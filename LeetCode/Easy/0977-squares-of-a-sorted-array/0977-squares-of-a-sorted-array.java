class Solution {
    public int[] sortedSquares(int[] nums) {
        int []squares=new int[nums.length];

        int last=nums.length-1;
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            System.out.println("left : "+left+" right : "+right);
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                squares[last]=nums[left]*nums[left];
                left++;
            }
            else{
                squares[last]=nums[right]*nums[right];
                right--;
            }
            last--;
        }
        return squares;
    }
}