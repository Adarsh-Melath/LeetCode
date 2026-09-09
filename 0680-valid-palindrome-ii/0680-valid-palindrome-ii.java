class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else if (s.charAt(left) != s.charAt(right)) {
                if (checkPalindrome(s.substring(left, right )) || checkPalindrome(s.substring(left + 1, right+1))) {
                    return true;
                }

                return false;
            }
        }

        return true;
    }

    private boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}