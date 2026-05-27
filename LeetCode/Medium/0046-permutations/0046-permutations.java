class Solution {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> currentPath=new ArrayList<>();
    boolean used[];
    public List<List<Integer>> permute(int[] nums) {
        used=new boolean[nums.length];
        backtrack(nums);
        return result;
    }

    public void backtrack(int [] nums){
        if(currentPath.size()==nums.length){
            result.add(new ArrayList<>(currentPath));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i])continue;

            used[i]=true;
            currentPath.add(nums[i]);

            backtrack(nums);

            currentPath.remove(currentPath.size()-1);
            used[i]=false;
        }
    }
}