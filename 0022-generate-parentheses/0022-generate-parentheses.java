class Solution {
    public List<String> func(int n , int o , int c , String curr , List<String> ans){
        if (curr.length()==2*n){
            ans.add(curr);
        }
        if (o<n) func(n,o+1,c,curr+"(",ans);
        if(c<o) func(n,o,c+1,curr+")", ans);
        return ans;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        return func (n,1,0,"(",ans);
        
    }
}