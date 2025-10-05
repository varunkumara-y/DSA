class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                int temp = hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) { // Check if the count (value) is 1
                return entry.getKey();   // Return the number (key)
            }
        
                }
                throw new IllegalArgumentException("No single number found in the array.");
                }
}