class Solution {
    public boolean slove(int n,Boolean[] dp){
        if(n==0){
            return false;
        }
        if(dp[n]!=null){
            return dp[n];
        }
        for(int i=1;i*i<=n;i++){
            int rem=n-i*i;
            if(!slove(rem,dp)){
                dp[n]=true;
                return true;
            }
        }
        dp[n]=false;
        return false;
    }
    public boolean winnerSquareGame(int n) {
       Boolean[] dp = new Boolean[n+1];
       dp[0]=false;
       boolean ans = slove(n,dp);
       return ans;
    }
}