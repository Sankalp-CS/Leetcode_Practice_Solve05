class Solution {
    public int minAddToMakeValid(String s) {
        int op=0;
        int move=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                op++;
            }else{
                op--;
            }
            if(op<0){
                op=0;
                move++;
            }
        }
        return move+op;
    }
}