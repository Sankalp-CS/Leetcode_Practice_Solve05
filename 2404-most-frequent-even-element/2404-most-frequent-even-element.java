class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (x % 2 == 0) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        Integer[] arr = map.keySet().toArray(new Integer[0]);
        Arrays.sort(arr, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a - b;
            }
            return map.get(b) - map.get(a);
        });
        if (arr.length != 0) {
            return arr[0];
        }
        return -1;
    }
}