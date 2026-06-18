class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
       int[] ugly = new int[n];
int[] idx = new int[primes.length];
long[] val = new long[primes.length];

Arrays.fill(val, 1L);

long next = 1;

for (int i = 0; i < n; i++) {
    ugly[i] = (int) next;
    next = Long.MAX_VALUE;

    for (int j = 0; j < primes.length; j++) {
        if (val[j] == ugly[i]) {
            val[j] = (long) ugly[idx[j]++] * primes[j];
        }
        next = Math.min(next, val[j]);
    }
}

return ugly[n - 1];
    }
}