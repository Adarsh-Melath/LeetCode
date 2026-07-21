class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> ts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (st.containsKey(sc)) {
                if (st.get(sc) != tc)
                    return false;
            } else
                st.put(sc, tc);

            if (ts.containsKey(tc)) {
                if (ts.get(tc) != sc)
                    return false;
            } else
                ts.put(tc, sc);
        }
        return true;
    }
}