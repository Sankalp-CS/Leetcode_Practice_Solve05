class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(0);
            }else{
                int value=st.pop();
                if(value==0){
                    value=1;
                }else{
                    value=2*value;
                }
                st.push(st.pop()+value);
            }
        }
        return st.peek();
    }
}