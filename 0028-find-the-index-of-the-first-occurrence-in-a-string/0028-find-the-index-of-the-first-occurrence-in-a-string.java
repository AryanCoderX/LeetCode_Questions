class Solution {
    public int strStr(String haystack, String needle) {

        int idx=0;
        for(char ch: haystack.toCharArray()){
            if(ch==needle.charAt(0)){
                boolean check= true;
                int onep=idx;
                for(char ch2: needle.toCharArray()){
                    if(onep >= haystack.length() || haystack.charAt(onep) != ch2){
                        check=false;
                        break;
                    }
                    onep++;
                }
                if(check) return idx;
            }
            idx++;
        }
        return -1;
    }
}