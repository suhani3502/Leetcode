class Solution {
    public int maxOperations(int[] nums, int k) { 
        Map<Integer, Integer> hm = new HashMap<>(); 
        for ( int i : nums ){
            if( !hm.containsKey(i) ){
                hm.put(i,0);
            }
            hm.put(i,hm.get(i)+1);
        }
        int ans = 0;
        for ( int i : nums ){
            int x = k-i; 
            if( hm.containsKey(x) ){
                if ( x == i && hm.get(i) <= 1 ) continue; 
                if ( hm.get(i) == 0 || hm.get(x) == 0 ) continue;
                hm.put(i,hm.get(i)-1);
                hm.put(x,hm.get(x)-1);
                ans++;
            }
        }
        return ans;
    }
}