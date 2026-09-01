class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (x % 2 == 0) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        int ans=-1;
        int maxFreq=0;
        for(int x:map.keySet()){
            if(map.get(x)>maxFreq ||
                (map.get(x)==maxFreq && x<ans) ){
                    maxFreq=map.get(x);
                    ans=x;
                }
        }
        return ans;
    }
}