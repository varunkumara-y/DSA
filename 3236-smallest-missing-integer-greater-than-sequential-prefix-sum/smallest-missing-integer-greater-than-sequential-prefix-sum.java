class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(hs.contains(sum)){
                sum+=1;
            }
        }
        return sum;
    }
}