class Solution {
    public int firstUniqChar(String s) {
        Queue<Character>q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
           q.add(s.charAt(i));
        }
        for(int i=0;i<q.size();i++){
            Character a=q.poll(); 
            if(!q.contains(a)){
               return i;
            }
            q.add(a);
        }
        return -1;
    }
}