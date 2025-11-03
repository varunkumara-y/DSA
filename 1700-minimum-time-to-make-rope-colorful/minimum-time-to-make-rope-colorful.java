class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime=0;
        for(int i=1;i<colors.length();i++)
        if(colors.charAt(i)==colors.charAt(i-1)){
            //just remove smaller one
            totalTime+=Math.min(neededTime[i],neededTime[i-1]);

            //keep larger one for future comparision
            neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
        }
        
    return totalTime;
    }
}