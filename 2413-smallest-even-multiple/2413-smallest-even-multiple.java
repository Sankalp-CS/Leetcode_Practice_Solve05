class Solution {
    public int smallestEvenMultiple(int n) {
        int m=gcd(n, 2);
        return (n*2)/m;
    }
     public int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
}