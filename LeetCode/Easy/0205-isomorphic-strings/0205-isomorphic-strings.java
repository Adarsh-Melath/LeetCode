class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> ts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);

            if (st.containsKey(sch)) {
                if (st.get(sch) != tch)
                    return false;
            } else
                st.put(sch, tch);

            if (ts.containsKey(tch)) {
                if (ts.get(tch) != sch)
                    return false;
            } else
                ts.put(tch, sch);
        }
        return true;
    }
}