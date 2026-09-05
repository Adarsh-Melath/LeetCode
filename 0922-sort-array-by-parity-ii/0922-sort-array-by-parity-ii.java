class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println(odd);
        System.out.println(even);
        int[] result = new int[nums.length];

        int evenI = 0;
        int oddI = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = even.get(evenI++);
            } else {
                result[i] = odd.get(oddI++);
            }
        }

        return result;
    }
}