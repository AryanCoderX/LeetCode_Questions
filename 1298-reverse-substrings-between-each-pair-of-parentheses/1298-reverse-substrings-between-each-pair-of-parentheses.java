class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> word = new Stack<>();

        for (char ch : s.toCharArray()) {

            word.push(ch);

            if (word.peek() == ')') {
                word.pop(); // remove ')'

                StringBuilder temp = new StringBuilder();

                while (word.peek() != '(') {
                    temp.append(word.pop());
                }

                word.pop(); // remove '('

                // Add reversed content back
                for (int i = 0; i < temp.length(); i++) {
                    word.push(temp.charAt(i));
                }
            }
        }

            StringBuilder ans = new StringBuilder();

            while (!word.isEmpty()) {
                ans.append(word.pop());
            }

            return ans.reverse().toString();
    }
}