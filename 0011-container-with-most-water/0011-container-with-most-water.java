class Solution {
    public int maxArea(int[] height) {
        int maxA = Integer.MIN_VALUE;
        int n = height.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int base = right - left;

            if (height[left] < height[right]) {
                maxA = Math.max(maxA, (base * height[left]));
                left++;
            } else {
                maxA = Math.max(maxA, (base * height[right]));
                right--;
            }
        }
        return maxA;
    }
}