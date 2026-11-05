

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr2);

        int count = 0;

        for (int x : arr1) {

            int low = 0;
            int high = arr2.length;

            
            while (low < high) {
                int mid = low + (high - low) / 2;

                if ((long) arr2[mid] < (long) x - d) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

           
            if (low == arr2.length ||
                (long) arr2[low] > (long) x + d) {
                count++;
            }
        }

        return count;
    }
}