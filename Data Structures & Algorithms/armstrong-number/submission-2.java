class Solution {
    public boolean isArmstrong(int n) {
        int og = n;
        int sum = 0;
        int len = String.valueOf(n).length();
       
        while(n > 0){
            int r = n % 10;
            sum += Math.pow(r, len);
            n = n / 10;
        }
        return sum == og;
    }
}
