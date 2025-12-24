class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int m = capacity.length;
        int sum=0;
        int count=0;
        for(int s:apple){
            sum+=s;
        }
       
        Arrays.sort(capacity);
        for(int i=m-1;i>=0;i--){
            if(sum<=0){
                return count;
            }
                sum-=capacity[i];
                count++;
        }
        return count;
    }
}