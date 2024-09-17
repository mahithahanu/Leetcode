class Solution {
    public int longestSubarray(int[] nums) {
       List<Integer>l=new ArrayList<>();
       for(int i:nums){
        l.add(i);
       }
       int max=Collections.max(l);
       int index=l.indexOf(max);
       int c=0;
    //    int i=index;
    int d=0;
       for(int i=index;i<nums.length;i++){
       if(nums[i]==max){
        c+=1;
        d=Math.max(c,d);
       }
       else{
        c=0;
       }
       }
       return d;
        }
}