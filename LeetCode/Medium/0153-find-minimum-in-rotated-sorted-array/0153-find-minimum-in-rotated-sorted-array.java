class Solution {
    public int findMin(int[] nums) {
        return solution(nums);
    }

    public static int solution(int []nums)
    {
        int index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                index=i;
                break;
            }
        }
        return nums[index];
    }
}