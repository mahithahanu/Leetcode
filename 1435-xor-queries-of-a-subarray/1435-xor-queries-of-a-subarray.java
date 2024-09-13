class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] arr1=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int d=0;
            for(int k=queries[i][0];k<=queries[i][1];k++){
                // System.out.println(arr[k]);
                d=d^arr[k];
                // System.out.println(d);
            }
            arr1[i]=d;
        }
        return arr1;
    }
}