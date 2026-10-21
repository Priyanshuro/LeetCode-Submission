
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char min = s.charAt(0);
        char max = s.charAt(0);
        boolean sorted = true;

        // Find minimum, maximum, and check sorted order
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);

            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);

            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
            }
        }

        // Case 1: Already sorted
        if (sorted) {
            return 0;
        }

        // Case 2: Unsorted string of length 2
        if (n == 2) {
            return -1;
        }

        // Case 3: One operation is enough
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        // Case 4: Minimum or maximum is in the middle
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        // Case 5: Minimum and maximum are at the wrong ends
        return 3;
    }
}
