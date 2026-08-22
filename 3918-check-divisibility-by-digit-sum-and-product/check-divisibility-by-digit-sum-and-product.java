class Solution {
    public boolean checkDivisibility(int n) {
        int dSum=0;
        int pSum=1;
        int num=n;
        while(num>0){
            int rem=num%10;
            dSum+=rem;
            pSum*=rem;
            num/=10;
        }
        int TotalSum=dSum+pSum;
        if(n%TotalSum==0){
            return true;
        }
        return false;
    }
}