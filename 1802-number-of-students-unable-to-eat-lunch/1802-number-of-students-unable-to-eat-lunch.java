class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>q1=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
            q1.add(sandwiches[i]);
        }
        int n=0;
        int e=0;
        while(e!=q.size()){
            int d=q.poll();
            // System.out.println(q1.peek());
            if(d==q1.peek()){
                q1.poll();
                n+=1;
                e=0;
            }
            else{
                q.add(d);
                e+=1;
                //  System.out.println(e);
            }
        }
        return e;
    }
}