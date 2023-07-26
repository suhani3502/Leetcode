class Solution {
    public String getHint(String secret, String guess) {
        int cntB= 0;
        int cntC= 0;
        int[] count1=new int[10];
        int[] count2= new int[10];
        for (int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)) cntB++;
            else{
                ++count1[secret.charAt(i)-'0'];
                ++count2[guess.charAt(i)-'0'];
            }
        }
        for (int i=0 ; i<10;i++){
            cntC+=Math.min(count1[i],count2[i]);
        }
        String ans = cntB+"A"+cntC+"B";
        return ans;
    }
}