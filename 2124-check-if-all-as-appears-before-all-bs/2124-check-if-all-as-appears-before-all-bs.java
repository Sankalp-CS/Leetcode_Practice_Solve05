class Solution {
    public boolean checkString(String s) {
        boolean seenb=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                seenb=true;
            }
            if(seenb==true && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}