class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n=nums.length;
        int[] prefixMax=new int[n];
        int[] suffixMin=new int[n];
        int max=nums[0];
        int min=nums[n-1];
        prefixMax[0]=max;
        suffixMin[n-1]=min;
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            prefixMax[i]=max;
        }
        for(int i=n-2;i>=0;i--){
            min=Math.min(min,nums[i]);
            suffixMin[i]=min;
        }
        int instability=0;
        for(int i=0;i<n;i++){
            instability=prefixMax[i]-suffixMin[i];
            if(instability<=k){
                return i;
            }
        }
        return -1;
    }
}