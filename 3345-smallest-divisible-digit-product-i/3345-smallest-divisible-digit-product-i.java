class Solution {
    public int smallestNumber(int current, int t) {
        while(true){
        int mul=1;
        int n=current;
        while(n!=0){
            mul*=n%10;
            n=n/10;
        }
        if(mul%t==0){
            return current;
        }
        current++;
        }
    }
}