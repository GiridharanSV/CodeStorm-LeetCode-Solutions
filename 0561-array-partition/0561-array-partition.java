class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<n;i+=2){
            result+=nums[i];
        }
        return result;
    }
}