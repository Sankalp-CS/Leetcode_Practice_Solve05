class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int curr_num=nums[i];
            int partner=target-curr_num;
            if(map.containsKey(partner))
            {
                return new int[]{map.get(partner),i};
            }
             map.put(curr_num, i);
        }
        return new int[]{};
    }
}