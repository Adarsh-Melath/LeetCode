class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hash = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (used.contains(tChar) && !hash.containsKey(sChar))
                return false;
            hash.put(sChar, tChar);

            used.add(tChar);
        }

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            string.append(hash.get(s.charAt(i)));
        }

        return t.contentEquals(string);

    }
}