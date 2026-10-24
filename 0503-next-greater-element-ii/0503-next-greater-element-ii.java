class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        Deque<Integer> st=new ArrayDeque<>();

        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            if(i<n && !st.isEmpty()){
                ans[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}