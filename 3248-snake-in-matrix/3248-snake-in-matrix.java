class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        int j=0;
        for(   String c:commands){
            if(c.equals("UP")){
                i--;
            }
            if(c.equals("DOWN")){
                i++;
            }
            if(c.equals("LEFT")){
                j--;
            }
            if(c.equals("RIGHT")){
                j++;
            }
        }
        return i*n+j;
    }
}