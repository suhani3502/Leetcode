public class Solution {
    public int addDigits(int num) {
        
        while(num>=10){
            String strNum= String.valueOf(num);
            int sum=0;
            for(char c: strNum.toCharArray()){
                sum=sum+ Character.getNumericValue(c);
            }
            num=sum;
        }
        return num;
    }
}