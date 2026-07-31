class Solution {
    public static int helper(int[] coins,int amount,int idx,int[][] dp){
        if(amount==0){
            return 1;
        }
        if(idx<0){
            return 0;
        }
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        int take=0;
        if(coins[idx]<=amount){
             take=helper(coins,amount-coins[idx],idx,dp);
        }
        int skip=helper(coins,amount,idx-1,dp);
        dp[idx][amount]=take+skip;
        return take+skip;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = helper(coins,amount,coins.length-1,dp);
        return ans;
    }
}