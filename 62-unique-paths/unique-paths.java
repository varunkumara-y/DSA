class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int [n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = helperFn(n-1,m-1,dp);
        return ans;
        
    }
    public int helperFn(int n,int m, int[][]dp){
        if(n==0||m==0){
            return 1;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        int x = helperFn(n-1,m,dp);
        int y = helperFn(n,m-1,dp);

        dp[n][m]=x+y;
        return x+y;
    }
}