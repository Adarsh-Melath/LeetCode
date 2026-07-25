class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String string : strs) {
            char[] chs = string.toCharArray();
            Arrays.sort(chs);
            String key = new String(chs);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(string);
        }
        return new ArrayList<>(map.values());
    }
}