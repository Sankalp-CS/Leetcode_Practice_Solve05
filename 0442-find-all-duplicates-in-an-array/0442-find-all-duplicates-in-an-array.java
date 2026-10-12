class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                res.add(n);
            }else{
                set.add(n);
            }
        }
        return res;
    }
}