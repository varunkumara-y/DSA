class Solution {
    public static int Helper(int[] piles,int left,int right,int[][] dp){
        if(left==right){
            return piles[right];
        }
        if(dp[left][right]!=-1){
            return dp[left][right];
        }
        int takeLeft = piles[left]-Helper(piles,left+1,right,dp);
        int takeRight=piles[right]-Helper(piles,left,right-1,dp);
        dp[left][right]=Math.max(takeLeft,takeRight);
        return Math.max(takeLeft,takeRight);
    }
    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return Helper(piles,0,piles.length-1,dp)>0;
    }
}