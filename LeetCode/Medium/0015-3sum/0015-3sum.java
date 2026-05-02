class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // second approach
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Map : ");
        System.out.println(map);

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int pending = -(nums[i] + nums[j]);
                int count =map.containsKey(pending)?map.get(pending):0;
                if (pending == nums[i])
                    count--;
                if (pending == nums[j])
                    count--;

                if (count > 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(pending);

                    Collections.sort(temp);
                    result.add(temp);
                }
            }
        }
        return new ArrayList<>(result);

        //brute force
        // Set<List<Integer>> result = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             int sum = nums[i] + nums[j] + nums[k];

        //             if (sum == 0) {
        //                 List<Integer> temp = new ArrayList<>();

        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);

        //                 Collections.sort(temp);
        //                 result.add(temp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(result);
    }
}