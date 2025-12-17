class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int [] ans = new int[nums.length];
        int p = ans.length-1;
        while(start<=end){
            int ss=nums[start] * nums[start];
            int es=nums[end]*nums[end];
            if(ss>es){
                ans[p]=ss;
                start++;
            }else{
                ans[p]=es;
                end--;
            }
            p--;
        }
        return ans;
        
    }
}