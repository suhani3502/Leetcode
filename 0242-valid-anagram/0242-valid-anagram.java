class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        char[] arr1= s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (s1!=t1) return false;

        boolean result = Arrays.equals(arr1,arr2);

        
        if(result){
            return true;
        }
        else{
            return false;
        }
    }
}