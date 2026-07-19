class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())return false;
        int freqs[] = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            freqs[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            freqs[magazine.charAt(i) - 'a']--;
        }

        System.out.println(Arrays.toString(freqs));

        for (int freq : freqs) {
            if (freq > 0) {
                return false;
            }
        }

        return true;
    }
}