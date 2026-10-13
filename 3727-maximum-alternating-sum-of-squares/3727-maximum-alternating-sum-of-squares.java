import java.util.*;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(arr);

        int mid = n / 2;
        long sum = 0;

        for (int i = 0; i < mid; i++) {
            sum -= arr[i];
        }

        for (int i = mid; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }
}