class Solution {
    public static int Kalla(int[] nums,int index,int[] dp){
        if(index<0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int max=0;
        int take=0;
         take=nums[index]+Kalla(nums,index-2,dp);
        int skip=Kalla(nums,index-1,dp);
        max=Math.max(take,skip);
       dp[index]= Math.max(take,skip);
    return Math.max(max,Math.max(take,skip));
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int ans = Kalla(nums,nums.length-1,dp);
        return ans;
    }
}