class Solution {
    public int maxArea(int[] height) {
        int maxA = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] < height[right]) {
                maxA = Math.max(maxA, ((right - left) * height[left]));
                left++;
            } else {
                maxA = Math.max(maxA, ((right - left) * height[right]));
                right--;
            }
        }
        return maxA;
    }
}