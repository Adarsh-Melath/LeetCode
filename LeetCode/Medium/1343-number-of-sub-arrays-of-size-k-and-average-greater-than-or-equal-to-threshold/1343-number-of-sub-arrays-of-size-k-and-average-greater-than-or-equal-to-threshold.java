class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //brute
        int count=0;
        for(int i=0;i<arr.length-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }

            int avg=(int) sum/k;
            if(avg>=threshold)count++;
        }

        return count;
    }
}