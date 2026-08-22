class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean increas=true;
        boolean decreas=true;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                increas=false;
            }
            if(nums[i]>nums[i-1]){
                decreas=false;
            }
        }
        return increas||decreas;
    }
}