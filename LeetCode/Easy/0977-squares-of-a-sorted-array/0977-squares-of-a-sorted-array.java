class Solution {
    public int[] sortedSquares(int[] nums) {
        int []squares=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            squares[i]=num * num;
        }

        Arrays.sort(squares);
        return squares;
    }
}