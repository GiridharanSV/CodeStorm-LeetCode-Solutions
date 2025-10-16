class Solution {
    public int countSegments(String s) {
        String[]s1=s.split(" ");
        int count=0;
        for(String segments:s1){
            if(!segments.isEmpty()){
                count++;
            }
        }
        return count;
    }
}