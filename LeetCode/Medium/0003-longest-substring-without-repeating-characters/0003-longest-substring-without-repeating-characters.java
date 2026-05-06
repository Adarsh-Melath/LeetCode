class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        HashSet<Character> set=new HashSet<>();

        int left=0;
        int right=0;
        int longestSubstring=1;

        while(right<s.length()){
           while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
           }

           set.add(s.charAt(right));
           longestSubstring=Math.max(set.size(),longestSubstring);

            right++;
        }
        return longestSubstring;
    }
}