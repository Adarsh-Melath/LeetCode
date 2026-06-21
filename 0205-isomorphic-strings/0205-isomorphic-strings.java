class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hash = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (hash.containsKey(sChar)) {
                if (hash.get(sChar) != tChar)
                    return false;
            } else {
                if (used.contains(tChar))
                    return false;
                hash.put(sChar, tChar);
                used.add(tChar);
            }
        }
        return true;
    }
}