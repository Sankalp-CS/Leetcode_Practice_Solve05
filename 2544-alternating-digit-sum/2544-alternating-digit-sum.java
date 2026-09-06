class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            if(i%2==0){
                sum+=s.charAt(i)-'0';
            }else{
                sum-=s.charAt(i)-'0';
            }
        }
        return sum;
    }
}