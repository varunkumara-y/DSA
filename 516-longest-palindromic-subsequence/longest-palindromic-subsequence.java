class Solution {
    public static int LCS(String s, int i, String s1, int j,int[][] dp){
        if(i==-1 || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int maxLen=0;
        if(s.charAt(i)==s1.charAt(j)){
            int x =LCS(s,i-1,s1,j-1,dp);
            dp[i][j]=x+1;
            return x+1;
        }else{
            int x = LCS(s,i-1,s1,j,dp);
            int y = LCS(s,i,s1,j-1,dp);
            dp[i][j]=Math.max(x,y);
            return Math.max(x,y);
        }
    }
    public int longestPalindromeSubseq(String s) {
        // String s1 =  s ;
        String s1 = new StringBuilder(s).reverse().toString();
        int n = s.length()-1;
        int m = s1.length()-1;
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = LCS(s,n,s1,m,dp);
        return ans;
    }
}