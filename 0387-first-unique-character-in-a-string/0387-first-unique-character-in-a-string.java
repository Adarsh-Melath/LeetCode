class Solution {
    public int firstUniqChar(String s) {
        int[] hash = new int[26];

        for (char ch : s.toCharArray()) {
            hash[ch - 'a']++;
        }

        int index = 0;
        for (char ch : s.toCharArray()) {
            if (hash[ch - 'a'] == 1) {
                return index;
            }
            index++;
        }
        return -1;
    }

}