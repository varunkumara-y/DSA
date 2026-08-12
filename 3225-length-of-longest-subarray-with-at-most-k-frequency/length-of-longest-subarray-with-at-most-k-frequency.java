class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
            while(hm.get(nums[right])>k){
                hm.put(nums[left],hm.getOrDefault(nums[left],0)-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}