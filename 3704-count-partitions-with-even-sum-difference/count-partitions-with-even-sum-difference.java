class Solution {
    public int countPartitions(int[] nums) {
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix =prefix + nums[i];
        }
            if(prefix%2==0){
              return nums.length-1;
            }
        return 0;
        }
        
    }