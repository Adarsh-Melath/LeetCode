class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int leftMax = 0;
        int rightMax = 0;

        int start = 0;
        int end = n - 1;

        int totalWater = 0;

        while (start < end) {
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);

            if (leftMax <rightMax) {
                totalWater += leftMax - height[start++];
            } else {
                totalWater += rightMax - height[end--];
            }
        }
        return totalWater;
    }
}