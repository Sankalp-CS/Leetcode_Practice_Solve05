class Solution {
    public int reverse(int x) {
        int y=0;
        int n=0;
        while(x!=0)
        {
            n=x%10;
            if(y>Integer.MAX_VALUE/10 || y< Integer.MIN_VALUE)
            return 0;
            if (y < -214748364 || (y == -214748364 && n < -8)) 
            return 0;
            
            y=y*10+n;
            x=x/10;
        }
        return y;
    }
}