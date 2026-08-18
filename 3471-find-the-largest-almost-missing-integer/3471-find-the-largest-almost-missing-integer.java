class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int ans = -1;

        int[] freq = new int[51];

        for (int x : nums) {
            freq[x]++;
        }

        // Only one subarray: the whole array
        if (k == n) {
            for (int x : nums) {
                ans = Math.max(ans, x);
            }
            return ans;
        }

        // k = 1: every element itself is a subarray
        if (k == 1) {
            for (int x : nums) {
                if (freq[x] == 1) {
                    ans = Math.max(ans, x);
                }
            }
            return ans;
        }

        // 1 < k < n
        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}