class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        if(n < 2){
            return money;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(prices[i] < min1 ){
                min2 = min1;
                min1 = prices[i];
            }else if(prices[i] >= min1 && prices[i] < min2){
                min2 = prices[i];
            }
        }
        int sum = money - (min1 + min2);
        return sum >= 0 ? sum : money;

    }
}