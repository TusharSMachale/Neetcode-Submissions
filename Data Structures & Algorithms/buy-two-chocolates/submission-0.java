class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        if(n < 2){
            return money;
        }
        Arrays.sort(prices);
        int i = 0;
        for(int j=1; j<n; j++){
            if(prices[i] + prices[j] <= money){
                return money - (prices[i] + prices[j]);
            }
        }
        return money;

    }
}