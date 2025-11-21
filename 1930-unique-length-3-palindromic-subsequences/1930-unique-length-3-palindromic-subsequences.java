class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int result = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            int left = -1, right = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (left == -1) left = i;
                    right = i;
                }
            }

            if (left == -1 || right == -1 || left == right) continue;

            boolean[] seen = new boolean[26];
            for (int i = left + 1; i < right; i++) {
                seen[s.charAt(i) - 'a'] = true;
            }

            for (boolean x : seen) {
                if (x) result++;
            }
        }

        return result;
    }
}
