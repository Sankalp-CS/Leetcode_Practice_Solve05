class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int i = 0;
        int[] freq = new int[n+1];
        for (int x : nums) {
            freq[x]++;
        }
        for (i = 0; i < n; i++) {
            if (freq[i] != 1) {

                break;
            }
        }
        return i;
    }
}