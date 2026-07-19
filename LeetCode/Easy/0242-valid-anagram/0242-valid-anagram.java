class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[]sa=new char[26];
        char[]ta=new char[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sa[ch-'a']++;
        }

        System.out.println(Arrays.toString(sa));

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            ta[ch-'a']++;
        }

        System.out.println(Arrays.toString(ta));

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(sa[ch-'a']!=ta[ch-'a'])return false;
        }

        return true;
    }
}