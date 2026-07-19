class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] characters = new char[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            characters[ch - 'a']++;
        }

        for(int i=0;i<t.length();i++){
            characters[t.charAt(i)-'a']--;
        }

        for(int freq:characters){
            if(freq!=0)return false;
        }



        return true;
    }
}