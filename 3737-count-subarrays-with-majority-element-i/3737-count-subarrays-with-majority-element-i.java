class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int targetSum=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target){
                    targetSum++;
                }
                int length=j-i+1;
                if(2*targetSum>length){
                    count++;
                }
            }
        }
        return count;
    }
}