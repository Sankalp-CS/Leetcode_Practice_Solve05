import java.math.BigInteger;
class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans = 0;

        for(int i=0;i<n;i++){
            BigInteger product=BigInteger.ONE;
            int lcm=1;
            int gcd=0;
            for(int j=i;j<n;j++){
                product=product.multiply(BigInteger.valueOf(nums[j]));
                gcd=gcd(gcd,nums[j]);
                lcm=(lcm / gcd(lcm, nums[j])) * nums[j];
                BigInteger result= BigInteger.valueOf(gcd)
                    .multiply(BigInteger.valueOf(lcm));
                if(product.equals(result)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    } 
}