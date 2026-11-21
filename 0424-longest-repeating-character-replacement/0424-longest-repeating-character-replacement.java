class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];

        int maxLen = 0;
        int maxFreq = 0;
        int left=0;
        for (int right = 0; right < n; right++) {
            char rch = s.charAt(right);
            freq[rch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[rch - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                char lch = s.charAt(left);
                freq[lch - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}