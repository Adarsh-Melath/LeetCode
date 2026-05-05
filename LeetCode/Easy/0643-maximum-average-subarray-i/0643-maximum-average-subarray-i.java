class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //optimal
        int maxSum=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        maxSum=sum;

        int start=0;
        int end=k;

        while(end<nums.length){
            sum-=nums[start++];
            sum+=nums[end++];

            maxSum=Math.max(maxSum,sum);
        }

        return (double)maxSum/k;

        //brute
        // if(nums.length==1)return nums[0];
        // int maxSum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length-k+1;i++){
        //     int sum=0;
        //     for(int j=i;j<i+k && j<nums.length;j++){
        //         sum+=nums[j];
        //     }
        //     maxSum=Math.max(maxSum,sum);
        // }

        // return (double)maxSum/k;
    }
}