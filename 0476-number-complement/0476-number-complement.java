class Solution {
    public int findComplement(int num) {
    //  String s=Integer.toString(num);
     String binary=Integer.toBinaryString(num);
     StringBuilder s=new StringBuilder(binary);
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            s.setCharAt(i,'1');
        }
        else{
            s.setCharAt(i,'0');
        }
     }
     String s1=s.toString();
     int d=Integer.parseInt(s1,2);
     return d;
    }
}