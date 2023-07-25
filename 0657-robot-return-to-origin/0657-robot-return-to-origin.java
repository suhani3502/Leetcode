class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;
        int j=0;
        for(int k=0 ; k<moves.length();k++){
            if(moves.charAt(k)=='R') j++;
            else if (moves.charAt(k)=='L') j--;
            else if (moves.charAt(k)=='U') i++;
            else i--;
        }
        if (i==0 && j==0) return true;
        else return false;
    }
}