class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int a=0;
        for(int i=0;i<n;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                 a=a-1;
            }
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                a=a+1;
            }
        }
        return a;
    }
}