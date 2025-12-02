class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                count++;
                nums[index++]=nums[i];
            }
        }
        while(index<nums.length){
            nums[index++]=-1;
        }
        return count;
    }
}