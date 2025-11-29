class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return minDistRec(word1,word2,m,n,dp);
        
    }
    int minDistRec(String word1,String word2, int m, int n, int [][] dp){
        if(m==0) return n;
        if(n==0) return m;

        if(dp[m][n]!=-1){
            return dp[m][n];

        }
        if(word1.charAt(m-1)==word2.charAt(n-1)){
            return dp[m][n]=minDistRec(word1,word2,m-1,n-1,dp);
        }
        return dp[m][n]=1+Math.min(Math.min(minDistRec(word1,word2,m,n-1,dp),minDistRec(word1,word2,m-1,n,dp)),minDistRec(word1,word2,m-1,n-1,dp));
    }
}