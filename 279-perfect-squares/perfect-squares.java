class Solution {
    public int numSquares(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        int ans = FindSqrt(dp,n);
        return ans;
    }
    public static int FindSqrt(int[] dp, int n){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int smallest=100;
        for(int i=1;i*i<=n;i++){
            int temp = FindSqrt(dp,n-i*i);
            smallest=Math.min(smallest,temp);
        }
        dp[n]=smallest+1;
        return smallest+1;
    }
}