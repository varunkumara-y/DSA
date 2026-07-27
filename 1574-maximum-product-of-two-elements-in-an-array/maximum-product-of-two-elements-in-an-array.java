class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // int ans = (nums[n-1]-1)*(nums[n-2]-1);
        // return ans;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                ans=Math.max(ans,((nums[i]-1)*(nums[j]-1)));
            }
        }

        return ans;
        
    }
}