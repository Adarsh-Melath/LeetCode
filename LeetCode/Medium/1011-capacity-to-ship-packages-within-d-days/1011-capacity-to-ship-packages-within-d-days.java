class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        //optimal
        int sum=0;
        int max=0;

        for(int weight:weights){
            max=Math.max(max,weight);
            sum+=weight;
        }
        
        int answer=0;
        int left=max;
        int right=sum;
        while(left<=right){
            int mid=left+(right-left)/2;
           
            int daysNeeded=1;
            int currentLoad=0;

            for(int weight:weights){
                if(currentLoad+weight<=mid){
                    currentLoad+=weight;
                }
                else {
                    daysNeeded++;
                    currentLoad=weight;
                }
            }

            if(daysNeeded<=days){
                answer=mid;
                right=mid-1;
            }
            else left=mid+1;

        }
        return answer;
        //brute force
        // int sum = 0;
        // int max = 0;

        // for (int weight : weights) {
        //     max = Math.max(max, weight);
        //     sum += weight;
        // }

        // for (int capacity = max; capacity <= sum; capacity++) {
        //     int daysNeeded = 1;
        //     int currentLoad = 0;
        //     for (int weight : weights) {
        //         if(currentLoad+weight<=capacity){
        //             currentLoad+=weight;
        //         }else{
        //             daysNeeded++;
        //             currentLoad=weight;
        //         }
        //     }

        //     if(daysNeeded<=days){
        //         return capacity;
        //     }
        // }

        // return -1;
    }
}