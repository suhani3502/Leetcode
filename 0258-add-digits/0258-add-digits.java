public class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            // Convert the number to a string to extract individual digits
            String numStr = String.valueOf(num);
            
            // Initialize the sum to 0
            int digitSum = 0;
            
            // Iterate through each character (digit) in the string
            for (char c : numStr.toCharArray()) {
                // Convert the character back to an integer and add it to the sum
                digitSum += Character.getNumericValue(c);
            }
            
            // Update the number to the new sum
            num = digitSum;
        }
        
        return num;
    }
}