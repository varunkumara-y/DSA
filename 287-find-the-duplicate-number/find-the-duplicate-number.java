class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                int temp = hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }
        }
        for(int i=0;i<n;i++){
            if(hm.get(nums[i])>1){
                return nums[i];
            }
        }
        return -1;
        }
}