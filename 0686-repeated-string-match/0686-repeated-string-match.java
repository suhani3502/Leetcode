class Solution {
  public int repeatedStringMatch(String A, String B) {
      int n = (int) Math.ceil((double) B.length()/ (double) A.length());
      String s= String.join("",Collections.nCopies(n,A));
      if(s.contains(B)) return n;
      if((s+A).contains(B)) return n+1;
      return -1;
  }
}

