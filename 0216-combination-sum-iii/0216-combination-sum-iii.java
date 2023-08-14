class Solution {
    public void backtrack (List<List<Integer>> result , List<Integer> ans , int k , int sum , int start ){
        if(ans.size()>k || sum<0) return;
        else if (ans.size()==k && sum==0){
            result.add(new ArrayList<>(ans));
        }
        else {
            for (int i = start; i <= 9; i++) {
                ans.add(i);
                backtrack(result, ans, k, sum - i, i + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result , new ArrayList<>(), k , n, 1);
        return result;
    }
}