import java.util.Arrays;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int l=candies[i]+extraCandies;
            if(l>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}