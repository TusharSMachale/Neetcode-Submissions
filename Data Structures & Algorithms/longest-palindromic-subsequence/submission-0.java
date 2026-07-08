class Solution {
    public int longestPalindromeSubseq(String s) {
        // Reverse the original string
        String r = new StringBuilder(s).reverse().toString();
        int n = s.length();
        
        // Create DP table for LCS
        int[][] dp = new int[n + 1][n + 1];
        
        // Fill the DP table using bottom-up approach
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i+1][j+1] = (s.charAt(i) == r.charAt(j)) ? 1 + dp[i][j] : Math.max(dp[i][j+1], dp[i+1][j]);
            }
        }
        
        // The last cell contains the length of the LCS (which is the LPS)
        return dp[n][n];
    }
}
