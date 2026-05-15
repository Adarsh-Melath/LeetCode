class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        int condition=k*threshold;
        if(sum>=condition)count++;

        int start=0;
        int end=k;

        while(end<nums.length){
            sum=sum+nums[end]-nums[start];

            if(sum>=condition)count++;

            start++;
            end++;
        }
        return count;  
    }
}