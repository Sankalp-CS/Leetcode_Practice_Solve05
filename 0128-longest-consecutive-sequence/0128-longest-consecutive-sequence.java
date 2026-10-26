class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
         int longest=0;
        for(int x:set){
           
           if(!set.contains(x-1)){
            int currentNum=x;
            int currentLength=1;
            while(set.contains(currentNum+1)){
                currentNum++;
                currentLength++;
            }
            longest=Math.max(currentLength,longest);
           }
        }
        return longest;
    }
}