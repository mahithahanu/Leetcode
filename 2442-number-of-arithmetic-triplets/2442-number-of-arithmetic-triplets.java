class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i]+diff) && s.contains(nums[i]+2*diff)){
                c=c+1;
            }
        }

        return c;
    }
}