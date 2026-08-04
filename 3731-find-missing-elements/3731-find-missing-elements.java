class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result=new ArrayList<>();
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(num,max);
            min=Math.min(num,min);
        }

        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}