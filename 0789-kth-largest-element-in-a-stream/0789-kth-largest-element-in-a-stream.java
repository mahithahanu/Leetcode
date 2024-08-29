class KthLargest {
  List<Integer>l=new ArrayList<>();
  int t=0;
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++){
             l.add(nums[i]);
        }
        t=k;
    }
    public int add(int val) {
       l.add(val);
       Collections.sort(l);
        // System.out.println(l);
        int n=l.size()-t;
       int p=l.get(n);
        // System.out.println(p);
       return p;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */