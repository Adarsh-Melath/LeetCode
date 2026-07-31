class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];

        for (int[] trip : trips) {
            int from = trip[1];
            int to = trip[2];
            int numPassengers = trip[0];

            diff[from] += numPassengers;
            diff[to] -= numPassengers;
        }

        int passengers = 0;
        for (int i = 0; i < diff.length; i++) {
            passengers += diff[i];
            if (passengers > capacity)
                return false;
        }

        return true;
    }
}