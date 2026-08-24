class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        while (max % min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        return min;
    }
}