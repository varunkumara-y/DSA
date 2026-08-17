class Solution {

    int[][] dp;
    int[] prefix;

    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;

        dp = new int[n][n];

        // -1 means state has not been calculated yet
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        // Prefix sum
        prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        return solve(0, n - 1);
    }

    private int solve(int l, int r) {

        // Only one stone
        if (l == r) {
            return 0;
        }

        // Already calculated
        if (dp[l][r] != -1) {
            return dp[l][r];
        }

        int ans = 0;

        // Try every possible split
        for (int k = l; k < r; k++) {

            int leftSum = prefix[k + 1] - prefix[l];
            int rightSum = prefix[r + 1] - prefix[k + 1];

            if (leftSum < rightSum) {

                // Left survives
                ans = Math.max(
                    ans,
                    leftSum + solve(l, k)
                );

            } else if (leftSum > rightSum) {

                // Right survives
                ans = Math.max(
                    ans,
                    rightSum + solve(k + 1, r)
                );

            } else {

                // Both are equal, Alice chooses the better side
                ans = Math.max(
                    ans,
                    leftSum + Math.max(
                        solve(l, k),
                        solve(k + 1, r)
                    )
                );
            }
        }

        return dp[l][r] = ans;
    }
}