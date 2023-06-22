class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line =0;
        int sum=0;
        for (int i=0; i<s.length();i++){
            sum=sum+widths[s.charAt(i)-'a'];
            if(sum>100){
                line=line+1;
                sum=0;
                i--;
            }
        }
        int[] num= new int[2];
        num[0]=line+1;
        num[1]=sum;
        return num;
    }
}