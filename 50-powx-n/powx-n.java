class Solution {
    public double myPow(double x, int n) {
        long N = n;  // convert to long to handle edge case safely
        
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) return 1;

        double temp = power(x, n / 2);

        if (n % 2 == 0)
            return temp * temp;
        else
            return temp * temp * x;
    }
}
