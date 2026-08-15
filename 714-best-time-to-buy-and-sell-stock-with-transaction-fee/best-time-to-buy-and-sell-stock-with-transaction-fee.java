class Solution {
    public static int slove(int idx, int buy, int[] prices, int fee,int[][] dp) {
        if (idx == prices.length) {
            return 0;
        }
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }
        int maxProfit = 0;

        if (buy == 1) {
            maxProfit = Math.max(
                -prices[idx] + slove(idx + 1, 0, prices, fee,dp),
                slove(idx + 1, 1, prices, fee,dp)
            );
        } else {
            maxProfit = Math.max(
                (prices[idx] - fee) + slove(idx + 1, 1, prices, fee,dp),
                slove(idx + 1, 0, prices, fee,dp)
            );
        }

        return dp[idx][buy]=maxProfit;
    }

    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length+1][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return slove(0, 1, prices, fee,dp);
    }
}