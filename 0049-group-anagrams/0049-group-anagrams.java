class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
       
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                 List<String> an=new ArrayList<>();
                 an.add(s);
                 map.put(key,an);
            }
        }
             res.addAll(map.values());
             return res;
    }
}