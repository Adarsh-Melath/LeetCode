class Solution {
    public int splitArray(int[] nums, int k) {
        int low=nums[0];
        int high=0;

        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }

        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(canFit(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }else low=mid+1;
        }

        return ans;
    }

    public boolean canFit(int[]nums,int maximum,int k){
        int count=1;
        int sum=0;

        for(int num:nums){
            if(sum+num>maximum){
                count++;
                sum=num;
            }else{
                sum+=num;
            }
        }
        

        return count<=k ? true: false;
    }
}