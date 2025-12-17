class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (divide(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean divide(int n) {
        int num = n;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}