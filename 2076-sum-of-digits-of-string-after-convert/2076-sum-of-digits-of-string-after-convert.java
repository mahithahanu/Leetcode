class Solution {
    public int getLucky(String s, int k) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a'+1;
            s1.append(String.valueOf(a));
        }
        String n=s1.toString();
        int sum=0;
        for(int i=0;i<k;i++){
            sum=0;
            for(char j:n.toCharArray()){
                 sum+=j-'0';
            }
            n=String.valueOf(sum);
        }
        return sum;
    }
}