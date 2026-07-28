class Solution {
    public static int helper(int[] nums,int index,int currSum,int target){
        if(index==nums.length){
            return currSum==target? 1 : 0;
        }
        int add = helper(nums,index+1,currSum+nums[index],target);
        int subtract= helper(nums,index+1,currSum-nums[index],target);
        return add+subtract;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int index=0;
        int currSum=0;
        int ans = helper(nums,index,currSum,target);
        return ans;
        
    }
}