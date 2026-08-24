class Solution {
    public int addDigits(int num) {
        // int sum=0;
        // while(num>0){
        //     int digit=num%10;
        //     sum+=digit;
        //     num/=10;
        // }
        // if(sum>9){
        //     return addDigits(sum);
        // }
        // return sum;
        int ans=0;
        if(num==0){
            ans=0;
        }else{
            ans=1+(num-1)%9;
        }
        return ans;
    }
}