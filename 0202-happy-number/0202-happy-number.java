class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        int number = n;
        while (number != 1) {
            int square = sq(number);

            if (set.contains(square))
                return false;

            set.add(square);

            number = square;
        }
        return true;
    }

    private int sq(int number) {
        int square = 0;

        while (number > 0) {
            int remainder = number % 10;
            square += remainder * remainder;
            number /= 10;
        }

        return  square;
    }
}