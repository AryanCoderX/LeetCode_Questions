import java.util.Arrays;

class Solution {
    public int helper(int n, int[] ways){
        // Base cases
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        
        ways[n] = helper(n - 1, ways) + helper(n - 2, ways);
        return ways[n];
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        int[] ways = new int[n + 1];

        Arrays.fill(ways, -1); 
        
        return helper(n, ways);
    }
}
