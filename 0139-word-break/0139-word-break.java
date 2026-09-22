class Solution {

    public class Node {

        Node[] childeren = new Node[26];
        boolean eow;

        Node() {
            for(int i = 0; i < 26; i++) {
                childeren[i] = null;
            }
        }
    }

    public Node root = new Node();

    public void insert(String word) {

        Node curr = root;

        for(int level = 0; level < word.length(); level++) {

            char ch = word.charAt(level);

            if(curr.childeren[ch - 'a'] == null) {
                curr.childeren[ch - 'a'] = new Node();
            }

            curr = curr.childeren[ch - 'a'];
        }

        curr.eow = true;
    }

    public boolean search(String word) {

        Node curr = root;

        for(int level = 0; level < word.length(); level++) {

            char ch = word.charAt(level);

            if(curr.childeren[ch - 'a'] == null) {
                return false;
            }

            curr = curr.childeren[ch - 'a'];
        }

        return curr.eow;
    }

    Boolean[] dp;

    public boolean wordBreakHelper(String s, int start) {

        if(start == s.length()) {
            return true;
        }

        if(dp[start] != null) {
            return dp[start];
        }

        for(int i = start + 1; i <= s.length(); i++) {

            if(search(s.substring(start, i)) &&
               wordBreakHelper(s, i)) {

                return dp[start] = true;
            }
        }

        return dp[start] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for(String word : wordDict) {
            insert(word);
        }

        dp = new Boolean[s.length()];

        return wordBreakHelper(s, 0);
    }
}