class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         int e=0;
        for(String s:words){
             int d=0;
            for(int i=0;i<s.length();i++){
                if(allowed.contains(String.valueOf(s.charAt(i)))){
                  d+=1;
                }
            }
            if(d==s.length()){
               e+=1;
            }
        }
        return e;
    }
}