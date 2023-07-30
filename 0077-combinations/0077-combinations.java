class Solution {
    public void func (int n, int k, int start, List<Integer> subarray, List<List<Integer>> ans){
        if (subarray.size()==k){
            ans.add(new ArrayList<>(subarray));
            return;
        } 
        
        for (int i=start; i<=n; i++){
            subarray.add(i);
            func(n, k , i+1 , subarray, ans);
            subarray.remove(subarray.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        func(n ,k, 1, new ArrayList<Integer>(), ans);
        return ans;
    }
}