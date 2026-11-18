class Solution {
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        System.out.println(low+" "+high);

        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (checkFit(nums, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean checkFit(int[] nums, int msum, int k) {
        int count = 1;

        int totalSum = 0;

        for (int num : nums) {
            if (totalSum + num > msum) {
                count++;
                totalSum = 0;
            } 
                totalSum += num;
            
        }

        return count <= k ? true : false;
    }
}