class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> s=new HashMap<>();
        for(String i:strs){
            char j[]=i.toCharArray();
            Arrays.sort(j);
            String a=new String(j);
            if(!s.containsKey(a)){
            s.put(a,new ArrayList<>());
            }
            s.get(a).add(i);
        }
        return new ArrayList<>(s.values());
        
    }
}