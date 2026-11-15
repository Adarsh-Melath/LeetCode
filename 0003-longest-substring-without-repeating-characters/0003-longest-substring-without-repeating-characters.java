class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        int right = 0;

        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            char rCh = s.charAt(right);

            while (set.contains(rCh)) {
                set.remove(s.charAt(left++));
            }

            set.add(rCh);
            maxLen = Math.max(maxLen, set.size());
            right++;
        }
        return maxLen;
    }
}