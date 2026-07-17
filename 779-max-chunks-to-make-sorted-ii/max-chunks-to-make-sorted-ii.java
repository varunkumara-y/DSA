class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] preMax = new int[arr.length];
        int[] suffMin = new int[arr.length];
        int ans=0;
        preMax[0]=arr[0];
        suffMin[arr.length-1]=arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            preMax[i]=Math.max(preMax[i-1],arr[i]);
        }
        for(int i=arr.length-2;i>=0;i--){
            suffMin[i]=Math.min(suffMin[i+1],arr[i]);
        }

        for(int i=0;i<arr.length-1;i++){
            if(preMax[i]<=suffMin[i+1]){
                ans+=1;
            }
        }
        ans+=1;
        return ans;
        
    }
}