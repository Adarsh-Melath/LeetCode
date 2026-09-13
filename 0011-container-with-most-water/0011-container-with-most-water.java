class Solution {
    public int maxArea(int[] height) {
        // brute
        int mostWater = 0;

        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int base = right - left;
            if (height[left] < height[right]) {
                mostWater = Math.max(mostWater, height[left++] * base);
            }else{
                mostWater=Math.max(mostWater,height[right--]*base);
            }
        }
        return mostWater;
    }
}