class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //brute O(n) O(n);
        // ArrayList<Integer> even = new ArrayList<>();
        // ArrayList<Integer> odd = new ArrayList<>();

        // for (int num : nums) {
        //     if (num % 2 == 0) {
        //         even.add(num);
        //     } else {
        //         odd.add(num);
        //     }
        // }

        // for (int i = 0; i < even.size(); i++) {
        //     nums[i] = even.get(i);
        // }

        // for (int i = even.size(); i < nums.length; i++) {
        //     nums[i] = odd.get(i - even.size());
        // }

        // return nums;

        //optimal : O(n) O(n)

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] % 2 == 0) {
                swap(nums, low, mid);

                low++;
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

        return nums;
    }

    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}