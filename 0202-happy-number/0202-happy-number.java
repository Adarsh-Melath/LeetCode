class Solution {
    public boolean isHappy(int n) {
        int number = n;
        HashSet<Integer> set = new HashSet<>();
        while (number != 1) {
            int square = 0;
            if (set.contains(number)) {
                return false;
            }
            set.add(number);
            while (number > 0) {
                int remainder = number % 10;
                square += Math.pow(remainder, 2);
                number /= 10;
            }

            number = square;
        }

        return true;

    }
}