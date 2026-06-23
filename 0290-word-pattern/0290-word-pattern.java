class Solution {
    public boolean wordPattern(String pattern, String s) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        if(pattern.length()!=list.size())return false;
        HashMap<Character, String> mapPS = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = list.get(i);

            if (mapPS.containsKey(ch)) {
                if (!mapPS.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (used.contains(word)) {
                    return false;
                }
                mapPS.put(ch, word);
                used.add(word);
            }
        }

        return true;
    }
}