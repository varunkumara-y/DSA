class Solution {
    static long MOD = 1000000007;
    public int countPermutations(int[] complexity) {

        int n = complexity.length;
        long count=1;
        int j=0;
        for(int i=1;i<n;i++){
            if(j<i && complexity[j]<complexity[i]){
                //used only this as reference
                count = (count*i) % MOD;
            }else{
                return 0;
        }
        }
        return (int)count;
        
    }
}