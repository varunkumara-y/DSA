class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                Swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                Swap(nums,mid,high);
                high--;
            }
        }
        
        
    }
    private static void Swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}