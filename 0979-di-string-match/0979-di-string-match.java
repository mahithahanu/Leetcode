class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        int l=0,h=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
               arr[i]=l;
               l+=1;
            }
            else{
                arr[i]=h;
                h-=1;
            }
        }
        arr[s.length()]=l;
        return arr;
    }
}