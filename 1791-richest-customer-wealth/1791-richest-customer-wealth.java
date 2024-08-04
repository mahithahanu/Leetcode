class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int c=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++){
            s=s+accounts[i][j];
            }
            if(s>c){
              c=s;
            }
        }
        return c;
    }
}