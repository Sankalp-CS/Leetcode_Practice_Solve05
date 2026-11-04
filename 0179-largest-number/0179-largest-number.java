

class Solution {
    public String largestNumber(int[] nums) {

        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {

                String ab = a.toString() + b.toString();
                String ba = b.toString() + a.toString();

                return ba.compareTo(ab);
            }
        });

        if (arr[0] == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (int x : arr) {
            sb.append(x);
        }

        return sb.toString();
    }
}
