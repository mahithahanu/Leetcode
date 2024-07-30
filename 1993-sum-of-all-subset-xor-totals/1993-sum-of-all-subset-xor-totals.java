class Solution {
    public int subsetXORSum(int[] nums) {
        int k=nums.length;
        int s=0;
        for(int i:nums){
            s=s|i;
      }
      return s*(1<<(k-1));
    }
}