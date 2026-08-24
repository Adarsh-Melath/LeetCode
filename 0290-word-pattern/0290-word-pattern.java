class Solution {
    public boolean wordPattern(String pattern, String s) {
        List<String> words = Arrays.asList(s.split("\\s+"));

        if (pattern.length() != words.size())
            return false;

        HashMap<Character, String> ps = new HashMap<>();
        HashMap<String, Character> sp = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            Character currentPattern = pattern.charAt(i);
            String currentWord = words.get(i);

            if (ps.containsKey(currentPattern)) {
                String previousWord = ps.get(currentPattern);
                if (!previousWord.equals(currentWord))
                    return false;
            } else {
                ps.put(currentPattern, currentWord);
            }

            if (sp.containsKey(currentWord)) {
                Character previousCharacter = sp.get(currentWord);
                if (previousCharacter != currentPattern)
                    return false;
            } else {
                sp.put(currentWord, currentPattern);
            }
        }
        return true;
    }
}