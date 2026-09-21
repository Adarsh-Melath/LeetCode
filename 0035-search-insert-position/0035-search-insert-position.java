class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer=0;

        int low=0;;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target)return mid;

            if(nums[mid]>target){
                answer=mid;
                high=mid-1;
            }else{
                low=mid+1;
                answer=low;
            }
        }
        return answer;
    }
}