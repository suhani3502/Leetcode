class Solution {
    public int countGoodSubstrings(String s) {
        int ans =0;
        for (int i=0; i<s.length()-2; i++){
            final char a = s.charAt(i);
            final char b = s.charAt(i+1);
            final char c = s.charAt(i+2);
            if (a==b || b==c || c==a) continue;
            else ans++;
        }
        return ans;
    }
}