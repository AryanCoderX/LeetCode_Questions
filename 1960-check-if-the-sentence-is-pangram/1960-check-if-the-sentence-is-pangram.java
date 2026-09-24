class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;

        StringBuilder sb= new StringBuilder();
        HashSet<Character> map= new HashSet<>();

        for(char ch: sentence.toCharArray()){
            if(sb.length()==26){
                break;
            }
            if(!map.contains(ch)){
                map.add(ch);
                sb.append(ch);
            }
        }

        return (sb.length()==26);
    }
}