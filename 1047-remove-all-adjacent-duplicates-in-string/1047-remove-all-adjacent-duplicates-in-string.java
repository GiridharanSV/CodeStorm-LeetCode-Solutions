class Solution {
    public String removeDuplicates(String s) {
        StringBuilder dup = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (dup.length() > 0 && dup.charAt(dup.length() - 1) == ch) {
                dup.deleteCharAt(dup.length() - 1);
            } else {
               dup.append(ch);
            }
        }
        return dup.toString();
    }
}