class Solution {
    public int[] plusOne(int[] digits) {
       int c=digits.length-1;
      while(c>=0){
        digits[c]=digits[c]+1;
        if(digits[c]<10){
            return digits;
        }
        digits[c]=0;
        c--;
      }
    int[] arr=new int[digits.length+1];
    arr[0]=1;
    return arr;
    }
}