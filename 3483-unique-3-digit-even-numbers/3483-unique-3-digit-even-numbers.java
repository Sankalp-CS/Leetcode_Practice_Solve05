import java.util.*;

class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        int ans = 0;

        for (int num = 100; num <= 999; num++) {

            // Number must be even
            if (num % 2 != 0) {
                continue;
            }

            int x = num;

            int last = x % 10;
            x /= 10;

            int middle = x % 10;
            x /= 10;

            int first = x;

            // Check whether the required digits are available
            int[] need = new int[10];
            need[first]++;
            need[middle]++;
            need[last]++;

            boolean possible = true;

            for (int d = 0; d <= 9; d++) {
                if (need[d] > freq[d]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                ans++;
            }
        }

        return ans;
    }
}