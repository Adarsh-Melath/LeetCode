class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int left = 0;
        int right = 0;

        Set<Character> set = new HashSet<>();
        int n = s.length();
        while (right < n) {
            char rch = s.charAt(right);
            while (set.contains(rch)) {
                char lch=s.charAt(left);
                left++;
                set.remove(lch);
            }
            set.add(rch);
            max = Math.max(max, set.size());
            right++;
        }
        return max;
    }
}