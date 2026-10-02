class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        int sum = (nums[i] + nums[j] + nums[k]);
                        ans=Math.min(ans,sum);
                    }
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}