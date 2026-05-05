class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //brute
        if(nums.length==1)return nums[0];
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k && j<nums.length;j++){
                sum+=nums[j];
            }
            maxSum=Math.max(maxSum,sum);
        }

        return (double)maxSum/k;
        // if(nums.length==1)return nums[0];
        // int left=0;
        // int right=0;
        // int sum=0;
        // double avg=0;
        // double maxAvg=0;

        // while(right<nums.length){
        //     while(right-left<k){
        //         System.out.println("right-left : "+(right-left)+" K: "+k);
        //         sum+=nums[right];
        //         System.out.println("sum : "+sum);
        //         right++;
        //         System.out.println("right : "+right);
        //     }

        //     avg=(double)sum/k;
        //     System.out.println("avg : "+avg);
        //     maxAvg=Math.max(avg,maxAvg);
        //     System.out.println("maxAverage: "+ maxAvg);

        //     avg=(sum-nums[left])/(k-1);
        //     System.out.println("sum-nums[left]/k-1: "+(sum-nums[left])/(k-1) );
        //     System.out.println("avg : "+avg);
        //     left++;
        //     System.out.println("left : "+left );

        //     System.out.println();
        // }

        // return maxAvg;
    }
}