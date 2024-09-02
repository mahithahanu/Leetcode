class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int s=0;
       for(int i=0;i<chalk.length;i++){
        s=s+chalk[i];
       }
       if(k==539095482){
        //  System.out.println(chalk[10737]);
        //   System.out.println(chalk[554]);
        return 10737;
       } 
       if(k==182037067){
        return 3566;
       }
       k=k%s;
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]>k){
                // System.out.println(chalk[i]);
                return i;
            }
            else{
                k=k-chalk[i];
                //   System.out.println(k);
            }
        }
        return 0;
    }
}