class Solution {
    public static int solve(int idx,int buy,int trans,int[] prices,int[][][] dp){
        int maxProfit=0;
        if(idx>=prices.length || trans == 2){
            return 0;
        }
        if(dp[idx][buy][trans]!=-1){
            return dp[idx][buy][trans];
        }
            if(buy==1){
                maxProfit = Math.max(
                    -prices[idx]+solve(idx+1,0,trans,prices,dp),
                    0+solve(idx+1,1,trans,prices,dp)
                );
            }else{
                maxProfit=Math.max(
                    prices[idx]+solve(idx+1,1,trans+1,prices,dp),
                    0+solve(idx+1,0,trans,prices,dp)
                );
            }
        return dp[idx][buy][trans]=maxProfit;
    }
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length+1][2][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(0,1,0,prices,dp);
    }
}