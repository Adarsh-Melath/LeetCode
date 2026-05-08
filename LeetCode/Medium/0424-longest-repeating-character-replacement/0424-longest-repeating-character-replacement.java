class Solution {
    public int characterReplacement(String s, int k) {

        int maxLength = 0;
        int maxFreq=0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char r=s.charAt(right);
            map.put(r, map.getOrDefault(r, 0) + 1);

            maxFreq = Math.max(maxFreq,map.get(r));

            while((right-left+1)-maxFreq> k )
            {
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }

            maxLength=Math.max(maxLength,right-left+1);
        }

        return maxLength;
    }
}