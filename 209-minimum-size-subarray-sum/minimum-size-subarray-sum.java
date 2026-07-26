class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){

            //add the value
            sum+=nums[right];

            //check the condition
            while(sum>=target){
                minLen=Math.min(minLen,right-left+1);

                //remove the left value
                sum-=nums[left];
            
                //expand the window 
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE? 0 : minLen;
        
    }
}