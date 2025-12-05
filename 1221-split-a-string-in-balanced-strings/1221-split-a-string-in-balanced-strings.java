class Solution {
    public int balancedStringSplit(String s) {
       int n=s.length();
       int count=0;
       int ans=0;
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='L'){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            ans+=1;
        }
       } 
       return ans;
    }
}