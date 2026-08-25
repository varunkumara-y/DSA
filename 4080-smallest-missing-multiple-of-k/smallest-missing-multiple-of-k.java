class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] found=new boolean[101];
        for(int num:nums){
            found[num]=true;
        }

        for(int i=k;;i+=k){
            if(i>100 || !found[i]){
                return i;
            }
        }
    }
}