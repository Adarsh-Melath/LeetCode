class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int index=0;
        for(char ch:s.toCharArray()){
            if(map.get(ch)==1)return index;
            index++;
        }

        return -1;
    }
}