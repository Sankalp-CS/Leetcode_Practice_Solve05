class Solution {
    public int maxProduct(int[] nums) {
        int fmax=-1;
        int smax=-1;
        for(int i=0;i<nums.length;i++){
            if(fmax<nums[i]){
                smax=fmax;
                fmax=nums[i];
            }else if(smax<nums[i]){
                smax=nums[i];
            }
        }
    return (smax-1)*(fmax-1);
    }
}