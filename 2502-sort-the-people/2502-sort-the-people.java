class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] arr=new String[names.length];
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
           map.put(heights[i],names[i]); 
        }
         List<Integer> list=new ArrayList<>();
         for(int i:heights){
            list.add(i);
         }
         Collections.sort(list,Collections.reverseOrder());
         for(int i=0;i<heights.length;i++){
            arr[i]=map.get(list.get(i));
         }
        return arr;
    }
}