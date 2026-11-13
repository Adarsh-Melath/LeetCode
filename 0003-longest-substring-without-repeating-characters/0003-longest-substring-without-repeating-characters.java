class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int max = 0;
        int left = 0;
        int right = 0;

        Set<Character> set = new HashSet<>();
        int n = s.length();
        while (right < n) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left++));
            }
            set.add(ch);
            max = Math.max(max, set.size());
            right++;
        }
        return max;
    }
}