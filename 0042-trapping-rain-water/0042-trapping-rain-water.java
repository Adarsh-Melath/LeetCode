class Solution {
    public int trap(int[] nums) {
        int n=nums.length;

        int left=0;
        int right=n-1;

        int leftM=0;
        int rightM=0;

        int answer=0;

        while(left<=right){
            leftM=Math.max(nums[left],leftM);
            rightM=Math.max(nums[right],rightM);

            if(leftM<rightM){
                answer+=leftM-nums[left++];
            }else{
                answer+=rightM-nums[right--];
            }
        }

        return answer;
    }
}