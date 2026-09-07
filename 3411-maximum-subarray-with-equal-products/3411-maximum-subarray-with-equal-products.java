class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length, res = 0;
        for (int i = 0; i < n; i++) {
            long prod = 1, g = 0, l = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);
                if (prod == g * l) res = Math.max(res, j - i + 1);
                else if (prod > g * l) break;
            }
        }
        return res;
    }
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}