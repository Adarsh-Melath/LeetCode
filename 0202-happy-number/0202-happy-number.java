class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        int number = n;

        while (number != 1) {
            int sq = square(number);

            if (set.contains(sq))
                return false;

            set.add(sq);
            number = sq;
        }

        return true;
    }

    private int square(int number) {
        int sq = 0;
        while (number > 0) {
            int remainder = number % 10;
            sq+=remainder*remainder;
            number/=10;
        }

        return sq;
    }
}