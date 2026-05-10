class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        if (s.equals(t))
            return s;

        //optimal approach

        int targetFreq[] = new int[128];
        int windowFreq[] = new int[128];

        int targetLength = t.length();
        int sourceLength = s.length();
        int minWindowStart = -1;
        int minWindowLength =s.length() + 1;

        int validCount = 0;

        for (char ch : t.toCharArray()) {
            targetFreq[ch]++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char rch = s.charAt(right);

            windowFreq[rch]++;

            if (windowFreq[rch] <= targetFreq[rch]) {
                validCount++;
            }

            while (validCount == targetLength) {
                char lch = s.charAt(left);

                if (right - left + 1 < minWindowLength) {
                    minWindowLength = right - left + 1;
                    minWindowStart = left;
                }

                if (windowFreq[lch] <= targetFreq[lch]) {
                    validCount--;
                }
                windowFreq[lch]--;
                left++;
            }

        }
            return minWindowStart < 0 ? "" : s.substring(minWindowStart,minWindowStart+minWindowLength); 
        //brute force
        //     String string = "";
        //     int minLength=Integer.MAX_VALUE;
        //     Map<Character, Integer> map2 = new HashMap<>();
        //     for (char ch : t.toCharArray()) {
        //         map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        //     }

        //     System.out.println("map2" + map2);

        //     for (int i = 0; i < s.length(); i++) {
        //         for (int j = i; j < s.length(); j++) {
        //             if (check(s, t, map2, i, j)) {
        //                 if ((j - i + 1) <minLength ) {
        //                     string = s.substring(i, j +1);
        //                     minLength=j+1-i;
        //                     System.out.println( " length : "+(j-i+1));
        //                 }
        //                     break  ; 
        //             }
        //         }
        //     }

        //     return string;
        // }

        // public boolean check(String string1, String string2, Map<Character, Integer> map2, int i, int j) {
        //     Map<Character, Integer> map = new HashMap<>();
        //     for (int start = i; start <=j; start++) {
        //         map.put(string1.charAt(start), map.getOrDefault(string1.charAt(start), 0) + 1);
        //     }
        //     System.out.println("map1 : " + map);
        //     for (char ch : string2.toCharArray()) {
        //         if (!map.containsKey(ch) || map.get(ch) < map2.get(ch)) {
        //             System.out.println("character : "+ch);
        //             System.out.println(" the reason : " + (map.containsKey(ch) && map.get(ch) < map2.get(ch))
        //                     + "map 1 value : " + map.get(ch) +
        //                     "map 2 value : " + map2.get(ch));
        //             return false;
        //         }
        //     }
        //     return true;

    }
}