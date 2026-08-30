class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
       int maxIndex=0;
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       int minIndex=0;
       int left=0,right=0;
       for(int i=0;i<nums.length;i++){
        if(max<nums[i]){
            max=nums[i];
            maxIndex=i;
        }
        if(min>nums[i]){
            min=nums[i];
            minIndex=i;
        }
        left=Math.min(minIndex,maxIndex);
        right=Math.max(minIndex,maxIndex);
       }
       int option1=left+1+(n-right);
        int option2=right+1;
        int option3=n-left;
        int ans=Math.min(option1,Math.min(option2,option3));
        return ans;
    }
}