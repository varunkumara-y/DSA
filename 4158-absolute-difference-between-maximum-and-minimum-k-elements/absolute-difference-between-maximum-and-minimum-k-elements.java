class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            ans+=(nums[i]-nums[n-i-1]);
        }
        return Math.abs(ans);
        
    }
}