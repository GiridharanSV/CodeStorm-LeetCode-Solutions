class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles; 
        int empty = numBottles;

        while (empty >= numExchange) {
            empty -= numExchange;
            numBottles = 1;
            total += numBottles;
            empty += numBottles;
            numExchange++;
        }
        return total;
    }
}
