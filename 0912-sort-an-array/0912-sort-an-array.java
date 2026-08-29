class Solution {
    public int[] merge(int[] nums, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int n = left.length;
        int m = right.length;
        while (i < n && j < m) {
            if (left[i] < right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        while (i < n) {
            nums[k++] = left[i++];
        }
        while (j < m) {
            nums[k++] = right[j++];
        }
        return nums;
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return nums;
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }
        sortArray(left);
        sortArray(right);
        merge(nums, left, right);
        return nums;
    }
}