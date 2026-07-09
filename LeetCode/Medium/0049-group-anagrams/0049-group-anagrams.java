class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String word=strs[i];
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);

            map.computeIfAbsent(sorted,k-> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}