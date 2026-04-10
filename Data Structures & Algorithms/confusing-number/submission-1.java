class Solution {
    public boolean confusingNumber(int n) {
        int og = n;
        int sum = 0;
  
        while(n > 0){
            int r = n % 10;
            if(r != 0 && r != 1 && r != 6 && r != 8 && r != 9){
                return false;
            }
            if(r == 6){
                r = 9;
            }
            else if(r == 9){
                r = 6;
            }
            sum = sum * 10 + r;
            n = n / 10;
        }
        return sum != og;
    }
}
