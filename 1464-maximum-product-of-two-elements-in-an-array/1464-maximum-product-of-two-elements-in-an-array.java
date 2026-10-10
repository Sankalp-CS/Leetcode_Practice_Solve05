class Solution {
    public int maxProduct(int[] nums) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
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