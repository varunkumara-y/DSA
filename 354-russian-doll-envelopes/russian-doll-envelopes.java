class Solution {
    class Pair implements Comparable<Pair>{
        int width;
        int height;

        Pair(int width,int height){
            this.width=width;
            this.height=height;
        }
        @Override
        public int compareTo(Pair other){
            if(this.width!=other.width){
                return this.width-other.width;
            }
            return other.height-this.height;
        }
    }
    public int maxEnvelopes(int[][] envelopes) {
        Pair[] pairs = new Pair[envelopes.length];
        
        for(int i=0;i<envelopes.length;i++){
            pairs[i]=new Pair(envelopes[i][0],envelopes[i][1]);
        }
        Arrays.sort(pairs);
        int[] dp = new int[envelopes.length];
        int len=0;
        for(Pair p: pairs){
            int height=p.height;
            int left=0;
            int right=len;
            while(left<right){
                int mid = left +(right-left)/2;
                if(dp[mid]<height){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
            dp[left]=height;
            if(left==len){
                len++;
            }
        }
        return len;
    }
}