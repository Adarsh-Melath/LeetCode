class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                answer = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }

        return answer == -1 ? letters[0] : letters[answer];
    }
}