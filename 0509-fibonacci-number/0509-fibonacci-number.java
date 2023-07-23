class Solution {
    public int rec (int n){
        if (n==1) return 1;
        if(n==0) return 0;
        int ans = rec(n-1)+rec(n-2);
        return ans;
    }
    public int fib(int n) {
        return rec(n); 
    }
}