class Solution {
    private static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // number of even indices
        long oddCount = n / 2;         // number of odd indices

        long pow5 = power(5, evenCount); // 5^evenCount % MOD
        long pow4 = power(4, oddCount);  // 4^oddCount % MOD

        return (int)((pow5 * pow4) % MOD);
    }

    // Fast power function (iterative)
    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) { // if exp is odd
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD; // square the base
            exp >>= 1; // divide exp by 2
        }
        return result;
    }
}
