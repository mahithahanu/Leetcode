class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] a=new int[points.length];
        for(int i=0,j=0;i<points.length;i++){
          a[i]=points[i][j];
        }
        int h=0;
        Arrays.sort(a);
        int l=0;
        int n=a.length;
        for(int i=1;i<a.length;i++){
            // for(int j=i+1;j<n+i-2;j++){
                l=Math.abs(a[i]-a[i-1]);  
                if(l>h){
                   h=l;
                }
            // }
            System.out.println(l);
        }
        return h;
    }
}