class Solution {
     public  static int gcd(int a, int b) {return b==0? a : gcd(b,a%b);}
    public long gcdSum(int[] nums) {
        int preGcd[] =new int[nums.length];
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            preGcd[i]=gcd(nums[i],maxi);
        }
        Arrays.sort(preGcd);
       
       long sum=0;
       int i=0,j=nums.length-1;
       while(i<j){
        sum+=gcd(preGcd[i],preGcd[j]);
        i++;
        j--;
       }
       return sum;
        
    }
}