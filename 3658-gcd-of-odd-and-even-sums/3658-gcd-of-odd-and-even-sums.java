class Solution {
    public int gcdOfOddEvenSums(int n) {
        int num=2*n;
        int sumEven=0;
        int sumOdd=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sumEven+=i;
            }else{
                sumOdd+=i;
            }
        }
        while(sumEven % sumOdd != 0){
            int rem=sumEven%sumOdd;
            sumEven=sumOdd;
            sumOdd=rem;
        }
        return sumOdd;
    }
}