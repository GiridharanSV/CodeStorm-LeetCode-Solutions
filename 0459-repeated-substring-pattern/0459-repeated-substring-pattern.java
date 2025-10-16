class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();
        String s1 = s.substring(1, size) + s.substring(0, size-1);
        return s1.contains(s);
    }
}