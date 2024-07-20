class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int b=numBottles;
        int e=b;
        int c=numExchange;
        int d=0;
        while(b>=c){
        int a=b/c;
        int f=b%c;
        d=d+a;
        b=a+f;
        }
        return d+e;
    }
}