class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] ans = new int[n+1][m+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                ans[i+1][j+1] = (text1.charAt(i) == text2.charAt(j)) ? 1 + ans[i][j] : Math.max(ans[i+1][j], ans[i][j+1]);
            }
        }
        return ans[n][m];

    }
}
