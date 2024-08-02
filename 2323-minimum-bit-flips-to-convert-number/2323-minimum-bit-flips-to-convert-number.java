class Solution {
    public int minBitFlips(int start, int goal) {
        start=start ^ goal;
        int c=0; 
        while((start)>0){
            if((start&1)==1){
            c+=1;
            }
            start=start>>1;
        }
        return c;
    }
}