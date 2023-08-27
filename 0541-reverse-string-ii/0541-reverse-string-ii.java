class Solution {
    public String reverseStr(String s, int k) {
        char[] chars= s.toCharArray();
        for (int start=0; start<s.length(); start=start+2*k){
            int left = start;
            int right = Math.min(start+k-1, s.length()-1);
            
            while(left<right){
                char temp = chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                right--;
                left++;
            }
        }
        return new String(chars);
    }
}