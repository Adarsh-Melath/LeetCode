class Solution {
    public int maxArea(int[] height) {
        int maxA = 0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            if(height[left]>height[right])
            {
                maxA=Math.max(maxA,height[right]*(right-left));
                right--;
            }else{
                maxA=Math.max(maxA,height[left]*(right-left));
                left++;
            }
        }
        return maxA;
    }
}