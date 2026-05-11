class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();

        int left=0;
        int right=0;

        int maxLength=0;

        while(right<s.length()){
            char rch=s.charAt(right);

            while(set.contains(rch)){
                char lch=s.charAt(left);
                left++;
                set.remove(lch);
            }

            set.add(rch);
            maxLength=Math.max(set.size(),maxLength);
            right++;
        }

        return maxLength;
    }
}