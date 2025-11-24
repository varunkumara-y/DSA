class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int val = 0;

        for(int n:nums){
            val=((val<<1)+n)%5;
            ans.add(val==0);

        }
        return ans;
        
    }
}