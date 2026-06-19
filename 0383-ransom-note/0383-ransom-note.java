class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomHash = new int[26];
        int[] magazineHash = new int[26];

        for (char ch : ransomNote.toCharArray()) {
            ransomHash[ch - 'a']++;
        }

        for (char ch : magazine.toCharArray()) {
            magazineHash[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (ransomHash[ch - 'a'] > magazineHash[ch - 'a'])
                return false;
        }

        return true;
    }
}