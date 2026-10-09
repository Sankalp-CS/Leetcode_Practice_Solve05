class Solution {
    public int arrayNesting(int[] nums) {
        int n=nums.length;
        int max=0;
        boolean[] vi=new boolean[n];
        for(int i=0;i<n;i++){
            if(vi[i]){
                continue;
            }
            int current=i;
            int count=0;
            while(!vi[current]){
                vi[current]=true;
                count++;
                current=nums[current];
            }
            max=Math.max(max,count);
        }
        return max;
    }
}