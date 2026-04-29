class Solution {
    public int[] twoSum(int[] nums, int target) {
        Pair[] arr = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        Arrays.sort(arr, (a, b) -> a.val - b.val);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left].val + arr[right].val;

            if (sum == target) {
                return new int[] { arr[left].index, arr[right].index };
            } else if (sum > target)
                right--;
            else
                left++;
        }
        return new int[] { -1, -1 };
    }
}

class Pair {
    int val;
    int index;

    public Pair(int val, int index) {
        this.val = val;
        this.index = index;
    }
}