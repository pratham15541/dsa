class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        // Mark only odd indices as potentially prime (skip evens)
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        // Start from 3, skip even numbers
        for (int i = 3; i * i < n; i += 2) {
            if (!isPrime[i]) continue;

            // Mark all odd multiples of i as non-prime
            for (int j = i * i; j < n; j += 2 * i) {
                isPrime[j] = false;
            }
        }

        // Count primes: we know 2 is prime, and only count odd numbers from 3 onward
        int count = 1; // for prime 2
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
