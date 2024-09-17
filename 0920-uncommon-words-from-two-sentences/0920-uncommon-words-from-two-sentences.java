class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // StringBuilder string1=new StringBuilder();
        // s1=s1+" ";
        // s2=s2+" ";
        // Set<String>set1=new HashSet<>();
        // Set<String>set2=new HashSet<>();
        // for(int i=0;i<s1.length();i++){
        //     string1.append(s1.charAt(i));
        //     if(s1.charAt(i)==' '){
        //         set1.add(string1.toString());
        //         string1.setLength(0);
        //     }
        // }
        // string1.setLength(0);
        //  for(int i=0;i<s2.length();i++){
        //     string1.append(s2.charAt(i));
        //     if(s2.charAt(i)==' '){
        //         set2.add(string1.toString());
        //         string1.setLength(0);
        //     }
        // }
        // int c=0;
        // for(String i:set1){
        //    if(set1.contains(i)){
        //     c+=1;
        //     if(c==1){
        //         if(!set2.contains(i)){
        //           arr[j]=i;
        //         }
        //     }
        //    }
        // }
        // System.out.println(set1);
        // System.out.println(set2);
        // return arr;
        List<String>l=new ArrayList<>();
        s1=s1+" ";
        s2=s2+" ";
        StringBuilder string2=new StringBuilder(s1);
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            string2.append(s2.charAt(i));
        }
        String main=string2.toString();
        StringBuilder string3=new StringBuilder();
        for(int i=0;i<main.length();i++){
            if(main.charAt(i)==' '){
                if (!string3.toString().isEmpty()) {
                 map.put(string3.toString(), map.getOrDefault(string3.toString(), 0) + 1);
                string3.setLength(0); 
                }
            }
                else{
                    string3.append(main.charAt(i));
                    // map.put(main,1);
                }
        }
       if (string3.length() > 0) {
    String lastWord = string3.toString();
    map.put(lastWord, map.getOrDefault(lastWord, 0) + 1);
}

        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                l.add(entry.getKey());
            }
        }
         String[] arr=new String[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}