class Solution {
    public int xorOperation(int n, int start) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=start;
          start=start+2;
        }
        int s=0;
        for(int i=0;i<n;i++){
            s=s^arr[i];
        }
        return s;
    }
}