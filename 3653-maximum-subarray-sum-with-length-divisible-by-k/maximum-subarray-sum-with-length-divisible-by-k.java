class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long sum=0;
        long maxSum = Long.MIN_VALUE;
        long[] minSoFar = new long[k];
        Arrays.fill(minSoFar, Long.MAX_VALUE / 2);
        minSoFar[(k-1)%k]=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxSum = Math.max(maxSum, sum-minSoFar[i%k]);
            minSoFar[i%k]=Math.min(minSoFar[i%k],sum);
        }
        return maxSum;
        
    }
}