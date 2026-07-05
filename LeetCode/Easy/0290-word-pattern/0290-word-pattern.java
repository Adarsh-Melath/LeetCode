class Solution {
    public boolean wordPattern(String pattern, String s) {
        List<String> words = Arrays.asList(s.split("\\s+"));

        if (pattern.length() != words.size())
            return false;

        HashMap<Character, String> mapPS = new HashMap<>();
        HashMap<String, Character> mapSP = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words.get(i);

            if (mapPS.containsKey(ch)) {
                if (!mapPS.get(ch).equals(word))
                    return false;
            } else
                mapPS.put(ch, word);

            if (mapSP.containsKey(word)) {
                if (mapSP.get(word) != ch)
                    return false;
            } else
                mapSP.put(word, ch);
        }

        return true;
    }
}