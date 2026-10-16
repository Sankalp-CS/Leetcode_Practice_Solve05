class Solution {
    public String removeStars(String s) {
        int n=s.length();
        Deque<Character> st=new ArrayDeque<>();
        StringBuilder ans=new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            char c=s.charAt(i);
            if(c=='*'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}