import java.math.BigInteger;

class Solution {

    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {

            BigInteger product = BigInteger.ONE;
            BigInteger lcm = BigInteger.ONE;
            BigInteger gcd = BigInteger.ZERO;

            for (int j = i; j < n; j++) {

                BigInteger x = BigInteger.valueOf(nums[j]);

                product = product.multiply(x);

                gcd = gcd.gcd(x);

                BigInteger common = lcm.gcd(x);
                lcm = lcm.divide(common).multiply(x);

                if (product.equals(gcd.multiply(lcm))) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}