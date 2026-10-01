class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;

        Stack<Character> word = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                word.push(ch);
            } 
            else {
                if (word.isEmpty()) return false;

                if (ch == ')' && word.peek() == '(') {
                    word.pop();
                } 
                else if (ch == '}' && word.peek() == '{') {
                    word.pop();
                } 
                else if (ch == ']' && word.peek() == '[') {
                    word.pop();
                } 
                else {
                    return false;
                }
            }
        }

        return word.isEmpty();
    }
}