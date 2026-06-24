class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String sortedString = new String(chars);

            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(str);
        }

        return new ArrayList<>(map.values());
    }
}