class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int n : nums1)
            map.put(n, map.getOrDefault(n, 0) + 1);
        for (int n : nums2)
            if (map.getOrDefault(n, 0) > 0) {
                res.add(n);
                map.put(n, map.get(n) - 1);
            }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            ans[i] = res.get(i);
        return ans;
    }
}
