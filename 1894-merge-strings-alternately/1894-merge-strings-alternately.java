class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder("");

        boolean toogle= true;
        int i=0, j=0;

        while(i<word1.length() && j<word2.length()){
            if(toogle){
                sb.append(word1.charAt(i));
                i++;
            }else{
                sb.append(word2.charAt(j));
                j++;
            }
            toogle=!toogle;
        }
        while(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}