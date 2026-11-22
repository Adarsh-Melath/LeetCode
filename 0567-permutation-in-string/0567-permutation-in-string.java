class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> s1Freq = new HashMap<>();
        Map<Character, Integer> s2Freq = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1Freq.put(s1.charAt(i), s1Freq.getOrDefault(s1.charAt(i), 0) + 1);
            s2Freq.put(s2.charAt(i), s2Freq.getOrDefault(s2.charAt(i), 0) + 1);
        }


        if (s1Freq.equals(s2Freq))
            return true;
        int left = 0;
        int right = s1.length();

        while (right < s2.length()) {
            char rch = s2.charAt(right);
            s2Freq.put(rch, s2Freq.getOrDefault(rch, 0) + 1);

            char lch = s2.charAt(left);
            s2Freq.put(lch, s2Freq.getOrDefault(lch, 0) - 1);

            if (s2Freq.get(lch) == 0) {
                s2Freq.remove(lch);
            }
            left++;
            if (s1Freq.equals(s2Freq))
                return true;
            right++;

        }
        return false;
    }
}