class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int d=0;
        for(int i=1;i<arrays.size();i++){
            List<Integer> arr=arrays.get(i);
            d=Math.max(d,Math.abs(arr.get(arr.size()-1)- min));
            d=Math.max(d,Math.abs(max-arr.get(0)));
            min = Math.min(min, arr.get(0));
            max = Math.max(max, arr.get(arr.size() - 1));
        }
        return d;
    }
}