class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Deque<Integer> st=new ArrayDeque<>();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            ans[i]=st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return ans;
    }
}