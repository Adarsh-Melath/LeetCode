class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        Map<Character, Integer> s1Count = new HashMap<>();
        Map<Character, Integer> s2Count = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if(s1Count.equals(s2Count)){
            return true;
        }

        int left=0;
        for(int right=s1.length();right<s2.length();right++){
            char rch=s2.charAt(right);
            s2Count.put(rch,s2Count.getOrDefault(rch,0)+1);

            char lch=s2.charAt(left);
            s2Count.put(lch,s2Count.getOrDefault(lch,0)-1);

            if(s2Count.get(lch)==0)s2Count.remove(lch);

            left++;

            if(s1Count.equals(s2Count)){
                return true;
            }
        }
        return false;
    }
}