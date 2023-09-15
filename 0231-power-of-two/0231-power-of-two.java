class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of two.
        }
        if (n == 1) {
            return true; // 2^0 = 1
        }
        if (n % 2 != 0) {
            return false; // If n is odd, it's not a power of two.
        }
        return isPowerOfTwo(n / 2);
        
    }
}