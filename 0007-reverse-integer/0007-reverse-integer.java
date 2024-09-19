class Solution {
    public int reverse(int x) {
        int h=1;
        if(x<0){
            x=x*(-1);
            h=-1;
        }
        int s=0;
        while(x>0)
      {
        int r=x%10;
        if(s>(Integer.MAX_VALUE - r) / 10){
            return 0;
        }
        s=s*10+r;
        x=x/10;
    }
   return s*h;
    }
}