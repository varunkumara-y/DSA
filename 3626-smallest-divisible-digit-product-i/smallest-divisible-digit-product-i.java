class Solution {
    public int smallestNumber(int n, int t) {
        while(productOdDigits(n)%t!=0){
            n+=1;
        }
        return n;
    }
    private int productOdDigits(int num){
        int product=1;
        while(num!=0){
            product*=num%10;
            num/=10;
        }
        return product;
    }
}