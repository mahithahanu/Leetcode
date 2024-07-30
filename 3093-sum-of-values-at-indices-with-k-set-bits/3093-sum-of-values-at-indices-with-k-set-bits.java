class Solution {
    int fun(int i){
        int c=0;
        while(i>0){
         if((i&1)==1){
           c=c+1;
         }
         i=i>>1;
        }
        return c;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0;
      for(int i=0;i<nums.size();i++){
        if(fun(i)==k){
           s+=nums.get(i);
        }
      }
      return s;
    }
}