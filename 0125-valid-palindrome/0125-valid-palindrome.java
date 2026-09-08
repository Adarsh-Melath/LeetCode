class Solution {
    public boolean isPalindrome(String s) {
        // s = s.replaceAll("[^a-zA-Z0-9]", "");
        // String newString= s.toUpperCase();

        StringBuilder string = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                string.append(ch);
            }
        }

        String newString = new String(string).toUpperCase();

        int left = 0;
        int right = newString.length() - 1;

        while (left < right) {
            if (newString.charAt(left) != newString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}