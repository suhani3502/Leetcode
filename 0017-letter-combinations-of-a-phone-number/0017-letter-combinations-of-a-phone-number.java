class Solution {
    public static void backtrack (String s , int i , HashMap<Character , String> map , StringBuilder sb , List<String> ans){
        if(i==s.length()){
            ans.add(sb.toString());
            return;
        }
        String curr = map.get(s.charAt(i));
        for (int j=0; j<curr.length();j++){
            sb.append(curr.charAt(j));
            backtrack(s,i+1,map,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    } 
    public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> ans = new ArrayList<String>();
        if(digits.length()==0) return ans;
        
        backtrack (digits, 0 , map, new StringBuilder(), ans);
        return ans;
    }
}