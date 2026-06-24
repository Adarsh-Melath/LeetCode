class Solution {
    public boolean wordPattern(String pattern, String s) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));

        if (pattern.length() != list.size())
            return false;

        HashMap<Character, String> mapPS = new HashMap<>();
        HashMap<String, Character> mapSP = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = list.get(i);

            if (mapPS.containsKey(ch)) {
                if (!mapPS.get(ch).equals(word)) {
                    return false;
                }
            } else {
                mapPS.put(ch, word);
            }

            if (mapSP.containsKey(word)) {
                if (mapSP.get(word) != ch)
                    return false;
            } else {
                mapSP.put(word, ch);
            }
        }

        return true;
    }
}