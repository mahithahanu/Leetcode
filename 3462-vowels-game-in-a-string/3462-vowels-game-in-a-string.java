class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character>st=new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        int c=0;
        for(int j=0;j<s.length();j++){
          if(st.contains(s.charAt(j))){
            return true;
          }
      }
      return false;
    }
}