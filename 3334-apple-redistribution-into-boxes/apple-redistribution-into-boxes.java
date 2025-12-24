class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n = apple.length;
        int m = capacity.length;
        int apple_sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            apple_sum+=apple[i];
        }
        Arrays.sort(capacity);
        for(int i=m-1;i>=0;i--){
            if(apple_sum<=0){
                return count;
            }
                apple_sum-=capacity[i];
                count++;
        }
        return count;
    }
}