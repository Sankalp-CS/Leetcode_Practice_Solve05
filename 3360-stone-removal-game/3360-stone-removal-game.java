class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        if(n>=10 && n<=18){
            return true;
        }
        if(n>26 && n<=33){
            return true;
        }
        if(n>39 && n<=44){
            return true;
        }
        if(n>48 && n<=50){
            return true;
        }
        return false;
    }
}