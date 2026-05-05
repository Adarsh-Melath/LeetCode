class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //optimal
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int count = 0;
        int avg = (int) sum / k;

        if (avg >= threshold)
            count++;
        int start = 0;
        int end = k;

        while (end < arr.length) {
            sum-=arr[start++];
            sum+=arr[end++];

            count+=(sum)/k >=threshold ?1:0;
        }

        return count;
        //brute
        // int count=0;
        // for(int i=0;i<arr.length-k+1;i++){
        //     int sum=0;
        //     for(int j=i;j<i+k;j++){
        //         sum+=arr[j];
        //     }

        //     int avg=(int) sum/k;
        //     if(avg>=threshold)count++;
        // }

        // return count;
    }
}