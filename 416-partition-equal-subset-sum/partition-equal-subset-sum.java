class Solution {

    public static boolean solve(int[] nums, int idx, int target, Boolean[][] dp) {

        if (target == 0) {
            return true;
        }

        if (idx == nums.length) {
            return false;
        }

        if (dp[idx][target] != null) {
            return dp[idx][target];
        }

        boolean take = false;

        if (nums[idx] <= target) {
            take = solve(nums, idx + 1, target - nums[idx], dp);
        }

        boolean skip = solve(nums, idx + 1, target, dp);

        dp[idx][target] = take || skip;

        return dp[idx][target];
    }

    public boolean canPartition(int[] nums) {

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return solve(nums, 0, target, dp);
    }
}