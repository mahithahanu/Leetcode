class Solution {
    public int numJewelsInStones(String jewels, String stones) {
           HashSet<Character> hashmap = new HashSet<>();
           int c=0;
           for(char i:jewels.toCharArray()){
               hashmap.add(i);
           }
           for(char i:stones.toCharArray()){
            if(hashmap.contains(i)){
                c=c+1;
            }
           }
           return c;
    }
}