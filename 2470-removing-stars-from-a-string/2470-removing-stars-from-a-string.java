class Solution {
    public String removeStars(String s) {
        Stack ans= new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='*'&& !ans.isEmpty()){
                ans.pop();
            }else{
                ans.push(ch);
            }
        }
        StringBuilder answer= new StringBuilder("");
        while(!ans.isEmpty()){
            answer.append(ans.peek());
            ans.pop();
        }
        return answer.reverse().toString();
    }
}