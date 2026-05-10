class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int right = 0;
        int maxLength = 0;
        int major = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char r = s.charAt(right);

            map.put(r, map.getOrDefault(r, 0) + 1);

            major = Math.max(major, map.get(s.charAt(right)));
            int remaining = (right - left + 1) - major;
            while ((right - left + 1) - major > k) {
                char l = s.charAt(left);
                map.put(l, map.getOrDefault(l, 0) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}