class Solution {
    public int distributeCandies(int[] candyType) {
        int count=0;
        int size= candyType.length;
        Arrays.sort(candyType);
        if(size<1) return 0;
        int prev=candyType[0];
        count++;
        for(int i =1;i<size;i++){
            if(candyType[i]!=prev){
                count++;
                prev=candyType[i];
            }
        }
        if(count <=(size/2)) return count;
        return size/2;
    }
}