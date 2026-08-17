class Solution {

    public static int burstBalloon(int[] arr, int s, int e,int[][] dp) {
        if (s + 1 >= e) {
            return 0;
        }
        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        int ans = Integer.MIN_VALUE;

        for (int i = s + 1; i < e; i++) {

            int leftAns = burstBalloon(arr, s, i,dp);
            int rightAns = burstBalloon(arr, i, e,dp);

            // i is the LAST balloon burst
            int myAns = leftAns + rightAns
                      + (arr[s] * arr[i] * arr[e]);

            ans = Math.max(ans, myAns);
            
        }

        return dp[s][e]=ans;
    }

    public int maxCoins(int[] nums) {

        int n = nums.length;

        // Add boundary balloons
        int[] a = new int[n + 2];

        a[0] = 1;
        a[n + 1] = 1;

        // Copy nums into the middle
        for (int i = 0; i < n; i++) {
            a[i + 1] = nums[i];
        }

        int[][] dp = new int[a.length+1][a.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return burstBalloon(a, 0, n + 1,dp);
    }
}