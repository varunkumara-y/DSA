class Solution {
    public int firstMissingPositive(int[] nums) {
     int n=nums.length;
    //  cleaning
    for(int i=0;i<n;i++){
        if(nums[i]<=0||nums[i]>n){
            nums[i]=Integer.MAX_VALUE;
        }
    }

    // marking
    for (int i = 0; i < n; i++) {
    int num = Math.abs(nums[i]);
    if (num <= n)
        nums[num - 1] = -Math.abs(nums[num - 1]);
}

    // finding number
    for(int i=0;i<n;i++){
        if(nums[i]>0){
            return i+1;
        }
    }
    return n+1;
    }
}