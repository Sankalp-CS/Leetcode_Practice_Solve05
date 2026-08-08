class Solution {
    public int thirdMax(int[] nums) {

        int n = nums.length;

        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == f || nums[i] == s || nums[i] == t) {
                continue;
            }

            count++;

            if (nums[i] > f) {
                t = s;
                s = f;
                f = nums[i];
            }
            else if (nums[i] > s) {
                t = s;
                s = nums[i];
            }
            else if (nums[i] > t) {
                t = nums[i];
            }
        }

        if (count < 3) {
            return (int) f;
        }

        return (int) t;
    }
}