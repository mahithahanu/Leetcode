class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
          arr[0]=first;
        //   System.out.println(first);
        for(int i=0;i<encoded.length;i++){
            first=first^encoded[i];
            //  System.out.println(first);
            arr[i+1]=first;
        }
        return arr;
    }
}