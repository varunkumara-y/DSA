class Solution {
    public static int LIS(int prev,int index,int[] arr,int[][] dp){
        if(index==arr.length){
            return 0;
        }
        if(dp[prev+1][index]!=-1){
            return dp[prev+1][index];
        }
        int take=0;
        if(prev==-1||arr[index]>arr[prev]){
            take=1+LIS(index,index+1,arr,dp);
        }
        int skip=LIS(prev,index+1,arr,dp);
        dp[prev+1][index]= Math.max(take,skip);
        return Math.max(take,skip);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = LIS(-1,0,nums,dp);
        return ans;
        
    }
}