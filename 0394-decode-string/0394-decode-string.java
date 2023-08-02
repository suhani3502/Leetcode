class Solution {
  public String decodeString(String s) {
    Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                resultStack.push(currentString.toString());
                currentString = new StringBuilder();
                count = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = new StringBuilder(resultStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
  }
}

