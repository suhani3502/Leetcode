class Solution {
    public String simplifyPath(String path) {
        Stack<String> st= new Stack<String>();
        final String[] ans= path.split("/");
        for (final String c: ans){
            if (c.isEmpty() || c.equals(".")){
                continue;
            }
            else if (c.equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else{
                st.push(c);
            }
        }
        return "/" + String.join("/" , st);
    }
}