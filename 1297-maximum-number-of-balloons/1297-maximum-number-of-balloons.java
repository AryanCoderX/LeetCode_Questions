class Solution {
    public int maxNumberOfBalloons(String text) {
        int []hs= new int[38]; 
        for(char ch: text.toCharArray()){
            hs[ch-'a']++;
        }
        // balon{1,1,2,2,1}{1,0,11,14,13}
        int count=hs[0];
        
            if(hs[1]<count) count=hs[1];
            if(hs[11]/2<count) count=hs[11]/2;
            if(hs[14]/2<count) count=hs[14]/2;
            if(hs[13]<count) count=hs[13];
       
        return count;
    }
}