class Solution {
    public int[] beautifulArray(int n) {
        if (n == 1) {
            return new int[]{1};
        }
        int[] ans=new int[n];
        int[] odd=beautifulArray((n+1)/2);
        int[] even=beautifulArray(n/2);
        int index=0;
        for(int v:odd){
            ans[index++]=2*v-1;
        }
        for(int v:even){
            ans[index++]=2*v;
        }
        return ans;
    }
}