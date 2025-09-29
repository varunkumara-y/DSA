class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int m = low+(high-low)/2;
            if(nums[m]<nums[high]){
                high=m;
            }else{
                low=m+1;
            }
        }
        return nums[low];
        
    }
}