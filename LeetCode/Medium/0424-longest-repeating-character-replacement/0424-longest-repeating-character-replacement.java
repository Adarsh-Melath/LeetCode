class Solution {
    public int characterReplacement(String s, int k) {

        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            int maxFreq = 0;
            for (int freq : map.values()) {
                maxFreq = Math.max(freq, maxFreq);
            }

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