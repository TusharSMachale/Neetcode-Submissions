class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for(int i=1; i<prices.length; i++){
            int sum = prices[i] - prices[i-1];
            if(sum > 0){
                ans += sum;
            }
        }
        return ans;
    }
}