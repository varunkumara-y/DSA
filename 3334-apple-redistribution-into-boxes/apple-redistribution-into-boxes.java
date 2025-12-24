class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int s:apple){
            sum+=s;
        }
       
        Arrays.sort(capacity);
        int count=0;
        int m = capacity.length;
        for(int i=m-1;i>=0;i--){
                sum-=capacity[i];
                count++;
                if(sum<=0){
                    break;
                }
        }
        return count;
    }
}