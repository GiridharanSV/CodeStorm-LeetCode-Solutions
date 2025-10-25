class Solution {
    public int totalMoney(int n) {
        int Weeks=n/7;
        int Days=n%7;
        int total=0;
        for(int i=0;i<Weeks;i++){
            int start=1+i;
            total+=(7*start)+(7*6)/2;
        }
        int start=1+Weeks;
        for(int i=0;i<Days;i++){
            total+=start+i;
        }
        return total;
    }
    
}