class Solution {
    public int search(int[] nums, int target) {
        // int left=0;
        // int right=nums.length-1;

        // while(left<=right){
        //     int mid=left+(right-left)/2;

        //     if(nums[mid]==target)return mid;
        //     else if (nums[0] > target && nums[mid]>target){
        //         left=mid+1;
        //     }else{
        //         right=mid-1;
        //     }
        // }

        // return -1;

        //brute
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i ; 
            }
        }

        return -1;
    }
}