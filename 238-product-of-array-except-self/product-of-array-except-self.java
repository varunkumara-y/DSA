class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preProd=new int[nums.length];
        preProd[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        preProd[i]=preProd[i-1]*nums[i];
        }
    int suffix=1;
    for(int i=nums.length-1;i>0;i--){
        preProd[i]=preProd[i-1]*suffix;
        suffix=suffix*nums[i];
    }
    preProd[0]=suffix;
    return preProd;
}
}