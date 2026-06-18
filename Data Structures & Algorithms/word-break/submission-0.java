class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int n = s.length();
        int max = 0;
        for(String word : wordDict){
            max = Math.max(max, word.length());
        }
        
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i=1; i<=n; i++){
                for (int j = Math.max(0, i - max); j < i; j++) {
                        if (dp[j] && set.contains(s.substring(j, i))) {
                                dp[i] = true;
                                break;
                        }
                }
        }

        return dp[n];
    }
}
