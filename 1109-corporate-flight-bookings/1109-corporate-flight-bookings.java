class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[]diff=new int[n+1];

        for(int [] booking:bookings)
        {
            int first=booking[0]-1;
            int last=booking[1];
            int seats=booking[2];

            diff[first]+=seats;
            diff[last]-=seats;
        }

        int[]answer=new int[n];
        int seats=0;
        for(int i=0;i<n;i++)
        {
            seats+=diff[i];
            answer[i]=seats;
        }
        return answer;
    }
}