class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int c=1;
        while(q.size()!=1){
            if(c<k) {
               int d=q.poll();
               q.add(d);
               c+=1;
            //    System.out.println(q);
            }
            else if(c==k){
                q.poll();
                c=1;
                // System.out.println(q);
            }
        }
        return q.peek();
    }
}