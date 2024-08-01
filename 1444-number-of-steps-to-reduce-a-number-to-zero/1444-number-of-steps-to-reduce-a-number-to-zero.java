class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        int d=0;
        while(num>0){
       if(num%2==0){
        num=num/2;
        c=c+1;
       } 
       else{
        num=num-1;
        d=d+1;
       }
        }
        return c+d;
    }
}