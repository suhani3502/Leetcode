class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] superUgly = new long[n];
        int[] pointers = new int[primes.length];
        
        superUgly[0] = 1;
        
        for (int i = 1; i < n; i++) {
            long nextUgly = Long.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                nextUgly = Math.min(nextUgly, superUgly[pointers[j]] * primes[j]);
            }
            
            superUgly[i] = nextUgly;
            
            for (int j = 0; j < primes.length; j++) {
                if (superUgly[pointers[j]] * primes[j] == nextUgly) {
                    pointers[j]++;
                }
            }
        }
        
        return (int) superUgly[n - 1];
    }
}