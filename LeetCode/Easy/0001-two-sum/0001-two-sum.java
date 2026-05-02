class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Two sum brute
        Pair[] arr = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        Arrays.sort(arr,(a,b)->a.value-b.value);

        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left].value+arr[right].value;

            if(sum==target)return new int[]{arr[left].index,arr[right].index};
            else if(sum>target)right--;
            else left++;
        }

        return new int[]{-1,-1};

        //optimal
        // Map<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     int compliment = target - nums[i];

        //     if (map.containsKey(compliment)) {
        //         return new int[] { map.get(compliment), i };
        //     }

        //     map.put(nums[i], i);
        // }

        // return new int[]{-1,-1};
    }
}

class Pair {
    int value;
    int index;

    public Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}