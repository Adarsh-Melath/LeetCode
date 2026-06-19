class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] shash = new int[26];
        int[] thash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            shash[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            thash[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (shash[t.charAt(i) - 'a'] != thash[t.charAt(i) - 'a']) {
                return false;
            }
        }

        return true;

    }
}