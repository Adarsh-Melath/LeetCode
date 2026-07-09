class Solution {
    public boolean wordPattern(String pattern, String s) {
        List<String> words = Arrays.asList(s.split(" "));
        if (words.size() != pattern.length())
            return false;

        HashMap<Character, String> ps = new HashMap<>();
        HashMap<String, Character> sp = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words.get(i);

            if (ps.containsKey(ch)) {
                if (!ps.get(ch).equals(word))
                    return false;
            } else {
                ps.put(ch, word);
            }

            if (sp.containsKey(word)) {
                if (sp.get(word) != ch)
                    return false;
            } else {
                sp.put(word, ch);
            }
        }
        return true;
    }
}