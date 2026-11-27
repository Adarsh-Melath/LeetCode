class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int n = s.length();

        Set<Character> set = new HashSet<>();

        while (right < n) {
            char rch = s.charAt(right);
            while (set.contains(rch)) {
                set.remove(s.charAt(left++));
            }

            set.add(rch);
            maxLen = Math.max(maxLen, set.size());
            right++;
        }

        return maxLen;
    }
}