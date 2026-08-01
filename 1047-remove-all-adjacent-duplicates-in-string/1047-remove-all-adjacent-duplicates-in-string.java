class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<=s.length()-1;i++ ){
            char ch=s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch){
                st.push(ch);
            }else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}