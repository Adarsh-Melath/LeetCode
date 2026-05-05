class Solution {
    public int removeDuplicates(int[] nums) {
        // int left=1;
        // for(int right=1;right<nums.length;right++){
        //     if(nums[right]!=nums[right-1]){
               
        //         nums[left]=nums[right];

        //         left++;
        //     }
        // }

        // return left;

         int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j]; 
            }
        }
        return i + 1;
    }
}