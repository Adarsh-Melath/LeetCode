class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int breakPoint = 0;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (smallest < nums[i]) {
                breakPoint = i;
                break;
            }
        }

        int writer = n - 1;
        int reader1 = 0;
        int reader2 = n - 1;

        while (reader1 <= reader2) {
            if (nums[reader1] > nums[reader2]) {
                result[writer] = nums[reader1];
                reader1++;
            } else {
                result[writer] = nums[reader2];
                reader2--;
            }

            writer--;
        }
        return result;
    }
}