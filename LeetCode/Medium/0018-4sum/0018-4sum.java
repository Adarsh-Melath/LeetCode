class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //two pointer 
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                    } else if (sum > target)
                        right--;
                    else
                        left++;
                }
            }
        }

        return result;
        //first approach 4 loops
        /*
            Set<List<Integer>> result=new HashSet<>();
        
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;j<nums.length-1;k++){
                    for(int l=k+1;l<nums.length;l++){
                        System.out.println("i : "+i+"j : "+j+"k: "+k+"l: "+l);
                        int sum=nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum==target){
                            List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(result);
        */
    }
}