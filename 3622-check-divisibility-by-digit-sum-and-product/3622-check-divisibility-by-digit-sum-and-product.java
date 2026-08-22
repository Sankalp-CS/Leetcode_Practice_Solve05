class Solution {
    public boolean checkDivisibility(int t) {
        int product=1;
        int sum=0;
        int n=t;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        return (t%(sum+product)==0)?true:false;
    }
}