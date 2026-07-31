class Solution {

    public static int helper(int[] coins, int amount, int idx,int[][] dp) {

        if (amount == 0) {
            return 0;
        }

       
        if (idx < 0) {
            return Integer.MAX_VALUE;
        }
         if(dp[idx][amount]!=-1){
            return dp[idx][amount]; 
        }

        int skip = helper(coins, amount, idx - 1,dp);

        int take = Integer.MAX_VALUE;

        if (coins[idx] <= amount) {
            int result = helper(coins, amount - coins[idx], idx,dp);

            if (result != Integer.MAX_VALUE) {
                take = 1 + result;
            }
        }
        dp[idx][amount]=Math.min(take,skip);
        return Math.min(take, skip);
    }

    public int coinChange(int[] coins, int amount) {

        
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = helper(coins, amount, coins.length - 1,dp);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}