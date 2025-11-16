class Solution {
    static final int M = 1_000_000_007;
    public int numSub(String s) {
       int ans=0;
       int ones=0;
       for(char ch : s.toCharArray()){
        if(ch=='1'){
            ones++;
            ans=(ans+ones) % M;
        }else ones=0;
       }
       return (int) ans;
    }
}