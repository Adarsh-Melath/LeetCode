class Solution {
    public boolean isValid(String s) {
        return brute(s);
    }

    public static boolean brute(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty();
    }
}