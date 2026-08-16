class Solution {
    public int solve(int idx, int buy, int[] prices,int[][] dp){
        int maxProfit=0;
        if(idx>=prices.length){
            return 0;
        }
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }
        if(buy==1){
            maxProfit=Math.max(
                -prices[idx]+solve(idx+1,0,prices,dp),
                0+solve(idx+1,1,prices,dp)
            );
        }else{
            maxProfit=Math.max(
                prices[idx]+solve(idx+2,1,prices,dp),
                0+solve(idx+1,0,prices,dp)
            );
        }
    return dp[idx][buy]=maxProfit;
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length+1][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,1,prices,dp);
        
    }
}