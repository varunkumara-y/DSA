class Solution {
    public static int Help(int[] s, int i,int[] dp){
        int ans = Integer.MIN_VALUE;
        if(i>=s.length){ return 0;
        }else if(dp[i]!=-1){
            return dp[i];
        }else{
            ans=Math.max(ans,s[i]-Help(s,i+1,dp));
            if(i+1<s.length) ans=Math.max(ans,s[i]+s[i+1]-Help(s,i+2,dp));
            if(i+2<s.length) ans=Math.max(ans,s[i]+s[i+1]+s[i+2]-Help(s,i+3,dp));
        
        }
        dp[i]=ans;
    return ans;
    }
    public String stoneGameIII(int[] stoneValue) {
        int[] dp = new int[stoneValue.length+1];
        Arrays.fill(dp,-1);
        int res=Help(stoneValue,0,dp);
        if(res>0) return "Alice";
        if(res<0) return "Bob";
    return "Tie";    
    }
}