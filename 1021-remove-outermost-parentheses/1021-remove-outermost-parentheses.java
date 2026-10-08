class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // Don't add the outermost '('
                if (balance > 0) {
                    ans.append(ch);
                }
                balance++;
            } 
            else {
                balance--;

                // Don't add the outermost ')'
                if (balance > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}