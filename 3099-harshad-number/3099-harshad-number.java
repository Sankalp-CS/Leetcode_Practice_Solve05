class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum=0;
        int x=n;
        while(x>0){
            int digit=x%10;
            sum+=digit;
            x/=10;
        }
        if(n%sum==0){
            return sum;
        }
        return -1;
    }
}