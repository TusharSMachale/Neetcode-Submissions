class Solution {
    public int arrangeCoins(int n) {
        int c = 0;
        int i = 1;
        while(n > 0){
            n-=i;
            if(n < 0){
                break;
            }
            c+=1;
            i++;
        }
        return c;
    }
}