class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                intersection.add(num);
                map.computeIfPresent(num,(key,val)->val>1?val-1:null);
            }
        }

        return intersection.stream().mapToInt(i->i).toArray();
        // List<Integer> numbers1 = new ArrayList<>();

        // for (int num : nums1) {
        //     numbers1.add(num);
        // }

        // List<Integer> intersections = new ArrayList<>();
        // for (int num:nums2) {
        //     if (numbers1.contains(num)) {
        //         intersections.add(num);
        //         numbers1.remove(Integer.valueOf(num));
        //     }
        // }

        // int[] result = new int[intersections.size()];

        // int index = 0;
        // for (int num : intersections) {
        //     result[index++] = num;
        // }

        // return result;
    }
}