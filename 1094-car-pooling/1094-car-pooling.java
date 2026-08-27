class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int highest = Integer.MIN_VALUE;

        for (int trip[] : trips) {
            int to = trip[2];
            highest = Math.max(to, highest);
        }

        for (int f = 0; f <= highest; f++) {
            int currentPassengers = 0;

            for (int[] trip : trips) {
                int passengers = trip[0];
                int from = trip[1];
                int to = trip[2];

                if (from <= f && f < to) {
                    currentPassengers += passengers;
                }
            }

            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
        // int highest = Integer.MIN_VALUE;

        // for (int trip[] : trips) {
        //     int to = trip[2];
        //     highest = Math.max(to, highest);
        // }

        // int[] diff = new int[highest + 1];

        // for (int trip[] : trips) {
        //     int passengers = trip[0];
        //     int from = trip[1];
        //     int to = trip[2];

        //     diff[from] += passengers;
        //     diff[to] -= passengers;
        // }

        // int currentPassengers = 0;

        // for (int i = 0; i < diff.length; i++) {
        //     currentPassengers += diff[i];

        //     if (currentPassengers > capacity)
        //         return false;
        // }

        // return true;
    }
}