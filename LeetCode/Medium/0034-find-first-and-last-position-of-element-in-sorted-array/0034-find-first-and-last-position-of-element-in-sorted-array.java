class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=lowerBound(nums,target);
        if(start==nums.length || nums[start]!=target)return new int []{-1,-1};
        int end=upperBound(nums,target);
        System.out.println(start);

        return new int[]{start,end};
    }

    public int upperBound(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        int answer=nums.length;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]>target){
                answer=mid;
                right=mid-1;
            }
            else left=mid+1;
        }

        return answer-1;
    }

    public int lowerBound(int[]nums,int target){
        int left=0;
        int right=nums.length-1;
        int answer=nums.length;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]>=target){
                answer=mid;
                right=mid-1;
            }
            else left=mid+1;
        }

        return answer;
    }
}