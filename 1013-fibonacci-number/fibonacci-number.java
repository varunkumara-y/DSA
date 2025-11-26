class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int prev1=0;
        int prev=1;
        int cur=1;
        for(int i=2;i<=n;i++){
            cur = prev1+prev;
            prev1=prev;
            prev=cur;
        }
        return cur;
}
}