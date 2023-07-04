class Solution {
    public String makeGood(String s) {
        String str = "";
        Stack<Character> st= new Stack<Character>();
        for (int i=0; i<s.length(); i++){
            if ((!st.isEmpty()) && Math.abs(st.peek()- s.charAt(i))==32) st.pop();
            else 
                st.push(s.charAt(i));
        }
        char res[] = new char[st.size()];
        for(int i=res.length-1;i>=0;i--) 
            res[i]= st.pop();
        return new String(res);
    }
}