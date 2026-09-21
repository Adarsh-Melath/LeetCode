class Solution {
    public int mySqrt(int x) {
        long answer = 0;
        long num = 0;

        while (num * num <= x) {
            answer = num;
            num++;
        }
        return (int) answer;
    }
}