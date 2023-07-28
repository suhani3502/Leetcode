class Solution {
    public boolean func (int count1[] , int[] count2){
        int diff=0;
        for (int i=0; i<26;++i){
            diff+=count2[i]-count1[i];
            if (diff<0) return false;
        }
        return true;
    }
    public boolean checkIfCanBreak(String s1, String s2) {
        int count1[]= new int[26];
        int count2[]= new int[26];
        
        for (final char c: s1.toCharArray()){
            ++count1[c-'a'];
        }
        for(final char c: s2.toCharArray()){
            ++count2[c-'a'];
        }
        return func(count1,count2) || func(count2,count1);
    }
}