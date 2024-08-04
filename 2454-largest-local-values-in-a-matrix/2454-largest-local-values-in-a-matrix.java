class Solution {
    public int[][] largestLocal(int[][] grid) {
        int r=grid.length;
        int[][] arr=new int[r-2][r-2];
        for(int i=0;i<r-2;i++){
            for(int j=0;j<r-2;j++){
                int m=Integer.MIN_VALUE;
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        m=Math.max(m,grid[i+k][j+l]);
                    }
                }
                arr[i][j]=m;
            }
        }
        return arr;
    }
}