class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> word= new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='(') word.push(ch);
            else if(!word.isEmpty() && ch==')'&& word.peek()=='(') word.pop();
            else
                word.push(ch);
        }

        return word.size();
    }
}