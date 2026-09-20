class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer>map= new HashMap<>();
        int val=26;
        for(char ch='a'; ch<='z'; ch++){
            map.put(ch,(val));
            val--;
        }

        int ans=0;
        int idx=1;
        for(char ch: s.toCharArray()){
            ans+=map.get(ch)*idx;
            idx++;
        }

        return ans;
    }
}