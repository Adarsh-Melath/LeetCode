class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Integer, Integer> mapST = new HashMap<>();
        HashMap<Integer, Integer> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int sChar = s.charAt(i);
            int tChar = t.charAt(i);

            if (mapST.containsKey(sChar)) {
                if (mapST.get(sChar) != tChar)
                    return false;
            } else
                mapST.put(sChar, tChar);

            if (mapTS.containsKey(tChar)) {
                if (mapTS.get(tChar) != sChar)
                    return false;
            } else {
                mapTS.put(tChar, sChar);
            }
        }
        return true;
    }
}