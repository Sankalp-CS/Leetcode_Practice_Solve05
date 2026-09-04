class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        boolean odd=false;
        for(int x:nums1){
            min=Math.min(min,x);
            if(x%2!=0){
                odd=true;
            }
        }
        if(min%2!=0){
            return true;
        }
        return !odd;
    }
}