class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        for (int i = 0; i <even.size(); i++) {
            nums[i]=even.get(i);
        }

        for(int i=even.size();i<nums.length;i++)
        {
            nums[i]=odd.get(i-even.size());
        }

        return nums;
    }
}