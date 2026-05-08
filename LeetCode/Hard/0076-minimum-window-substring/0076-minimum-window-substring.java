class Solution {
    public String minWindow(String s, String t) {
        //approach 2 (optimal)
        int left = 0;
        int []targetFreq = new int[128];
        int []windowFreq = new int[128];

        for (char ch : t.toCharArray()) {
            targetFreq[ch]++;
        }

        int sourceLength = s.length();
        int targetLength = t.length();

        int minWindowStart = -1;
        int minWindowLength = sourceLength + 1;
        int validCount = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            windowFreq[rightChar]++;

            if (windowFreq[rightChar] <= targetFreq[rightChar])
                validCount++;

            while (validCount == targetLength) {

                if (right - left + 1 < minWindowLength) {
                    minWindowLength = right - left + 1;
                    minWindowStart = left;
                }

                char leftCh = s.charAt(left);

                if (windowFreq[leftCh] <= targetFreq[leftCh]) {
                    validCount--;
                }

                windowFreq[leftCh]--;
                left++;
            }
        }

        return minWindowStart<0 ? "": s.substring(minWindowStart, minWindowStart+ minWindowLength);

        //approach 1
        // if (s.length() < t.length())
        //     return "";
        // if (s.length() == t.length() && s.equals(t))
        //     return s;

        // String min = "";
        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i; j < s.length(); j++) {
        //         if (checkItContains(s, i, j, t)) {

        //             if (min == "") {
        //                 min = s.substring(i, j + 1);
        //                 break;
        //             } else {
        //                 if (min.length() > j - i + 1)
        //                     min = s.substring(i, j + 1);
        //             }
        //         }
        //     }
        // }
        // return min;
    }

    // public boolean checkItContains(String s, int i, int j, String t) {
    //     Map<Character, Integer> string1 = new HashMap<>();
    //     Map<Character, Integer> string2 = new HashMap<>();

    //     for (int index1 = i; index1 <= j; index1++) {
    //         string1.put(s.charAt(index1), string1.getOrDefault(s.charAt(index1), 0) + 1);
    //     }

    //     for (int index2 = 0; index2 < t.length(); index2++) {
    //         string2.put(t.charAt(index2), string2.getOrDefault(t.charAt(index2), 0) + 1);
    //     }
    //     for (char ch : string2.keySet()) {
    //         if (!string1.containsKey(ch) || (string1.get(ch) < string2.get(ch)))
    //             return false;
    //     }

    //     return true;
    // }
}